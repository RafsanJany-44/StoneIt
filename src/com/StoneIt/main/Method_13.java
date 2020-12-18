package com.StoneIt.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Method_13 extends MethodController {

	private String password;

	byte[] flags_byte = new byte[8];

	private void stoneIt(String inputFileName, String outputFileName) {

		try {
			InputStream inputFile = new BufferedInputStream(new FileInputStream(new File(inputFileName)));
			OutputStream outputFile = new BufferedOutputStream(new FileOutputStream(new File(outputFileName)));

			int length = (int) new File(inputFileName).length();

			int flag = flags_byte[0] + 90, flag_1 = flags_byte[1] - 118, flag_2 = flags_byte[2] + 134,
					flag_3 = flags_byte[3] - 27, flag_4 = flags_byte[4], flag_5 = flags_byte[5] + 36,
					flag_6 = flags_byte[6] - 68, flag_7 = flags_byte[7],
					flag_control = (Math.abs(flags_byte[5] % 8) + 1);

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

						data[i] = (byte) (data[i] + flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] + flag_3);
						flag_control = 5;
					} else if (flag_control == 5) {

						data[i] = (byte) (data[i] - flag_4);
						flag_control = 6;
					} else if (flag_control == 6) {

						data[i] = (byte) (data[i] - flag_5);
						flag_control = 7;
					} else if (flag_control == 7) {

						data[i] = (byte) (data[i] + flag_6);
						flag_control = 8;
					} else if (flag_control == 8) {

						data[i] = (byte) (data[i] - flag_7);
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

			int flag = flags_byte[0] + 90, flag_1 = flags_byte[1] - 118, flag_2 = flags_byte[2] + 134,
					flag_3 = flags_byte[3] - 27, flag_4 = flags_byte[4], flag_5 = flags_byte[5] + 36,
					flag_6 = flags_byte[6] - 68, flag_7 = flags_byte[7],
					flag_control = (Math.abs(flags_byte[5] % 8) + 1);

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

						data[i] = (byte) (data[i] - flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] - flag_3);
						flag_control = 5;
					} else if (flag_control == 5) {

						data[i] = (byte) (data[i] + flag_4);
						flag_control = 6;
					} else if (flag_control == 6) {

						data[i] = (byte) (data[i] + flag_5);
						flag_control = 7;
					} else if (flag_control == 7) {

						data[i] = (byte) (data[i] - flag_6);
						flag_control = 8;
					} else if (flag_control == 8) {

						data[i] = (byte) (data[i] + flag_7);
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
		char[] flags = new char[8];
		flags = password.toCharArray();
		for (int i = 0; i < flags.length; i++) {
			flags_byte[i] = (byte) (flags[i] + (2 * i));

		}

	}

	void selectMethod1(String inputFileName, String outputFileName) {
		this.stoneIt(inputFileName, outputFileName);
	}

	void selectMethod2(String inputFileName, String outputFileName) {
		this.buildIt(inputFileName, outputFileName);
	}

}
