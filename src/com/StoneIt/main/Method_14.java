package com.StoneIt.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Method_14 extends MethodController {

	private String password;

	byte[] flags_byte = new byte[5];

	private void stoneIt(String inputFileName, String outputFileName) {

		try {
			InputStream inputFile = new BufferedInputStream(new FileInputStream(new File(inputFileName)));
			OutputStream outputFile = new BufferedOutputStream(new FileOutputStream(new File(outputFileName)));

			int length = (int) new File(inputFileName).length();

			int flag = flags_byte[0] + 42, flag_1 = flags_byte[1] - 72, flag_2 = flags_byte[2] + 44,
					flag_3 = flags_byte[3] - 158, flag_control = (Math.abs(flags_byte[4] % 4) + 1);

			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if (flag_control == 1) {

						data[i] = (byte) (data[i] + flag);
						flag_control = 2;
					} else if (flag_control == 2) {

						data[i] = (byte) (data[i] + flag_1);
						flag_control = 3;
					} else if (flag_control == 3) {

						data[i] = (byte) (data[i] - flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] + flag_3);
						flag_control = 1;
					}

				}

				outputFile.write(data);
			}
			inputFile.close();
			outputFile.close();

		} catch (Exception e) {
			errorMessage();
		}
	}

	private void buildIt(String inputFileName, String outputFileName) {

		try {
			InputStream inputFile = new BufferedInputStream(new FileInputStream(new File(inputFileName)));
			OutputStream outputFile = new BufferedOutputStream(new FileOutputStream(new File(outputFileName)));

			int length = (int) new File(inputFileName).length();

			int flag = flags_byte[0] + 42, flag_1 = flags_byte[1] - 72, flag_2 = flags_byte[2] + 44,
					flag_3 = flags_byte[3] - 158, flag_control = (Math.abs(flags_byte[4] % 4) + 1);

			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if (flag_control == 1) {

						data[i] = (byte) (data[i] - flag);
						flag_control = 2;
					} else if (flag_control == 2) {

						data[i] = (byte) (data[i] - flag_1);
						flag_control = 3;
					} else if (flag_control == 3) {

						data[i] = (byte) (data[i] + flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] - flag_3);
						flag_control = 1;
					}

				}

				outputFile.write(data);
			}
			inputFile.close();
			outputFile.close();

		} catch (Exception e) {
			errorMessage();
		}
	}

	void setPassword(String passWord) {
		password = passWord;
		char[] flags = password.toCharArray();
		int counter = 1;
		flags_byte[0] = 0;
		flags_byte[1] = 0;
		flags_byte[2] = 0;
		flags_byte[3] = 0;
		for (int i = 0; i < flags.length; i++) {

			if (counter == 1) {
				flags_byte[0] = (byte) (flags_byte[0] + flags[i]);
				counter = 2;
			} else if (counter == 2) {
				flags_byte[1] = (byte) (flags_byte[1] + flags[i]);
				counter = 3;
			} else if (counter == 3) {
				flags_byte[2] = (byte) (flags_byte[2] + flags[i]);
				counter = 4;
			} else if (counter == 4) {
				flags_byte[3] = (byte) (flags_byte[3] + flags[i]);
				counter = 1;
			}

		}
		flags_byte[4] = (byte) ((flags_byte[0] + flags_byte[1] + flags_byte[2] + flags_byte[3]) / 4);

	}

	void selectMethod1(String inputFileName, String outputFileName) {
		this.stoneIt(inputFileName, outputFileName);
	}

	void selectMethod2(String inputFileName, String outputFileName) {
		this.buildIt(inputFileName, outputFileName);
	}

}
