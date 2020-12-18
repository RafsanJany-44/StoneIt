package com.StoneIt.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Method_8 extends MethodController {

	private void stoneIt(String inputFileName, String outputFileName) {

		try {
			InputStream inputFile = new BufferedInputStream(new FileInputStream(new File(inputFileName)));
			OutputStream outputFile = new BufferedOutputStream(new FileOutputStream(new File(outputFileName)));

			int length = (int) new File(inputFileName).length();
			int flag = 30, flag_1 = 33, flag_2 = 54, flag_3 = -119, flag_4 = 18, flag_5 = 111, flag_6 = -44, flag_7 = 3,
					flag_control = 1;
			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if (flag_control == 1) {

						data[i] = (byte) (data[i] - flag);
						flag_control = 2;
					} else if (flag_control == 2) {

						data[i] = (byte) (data[i] + flag_1);
						flag_control = 3;
					} else if (flag_control == 3) {

						data[i] = (byte) (data[i] - flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] + flag_3);
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
			int flag = 30, flag_1 = 33, flag_2 = 54, flag_3 = -119, flag_4 = 18, flag_5 = 111, flag_6 = -44, flag_7 = 3,
					flag_control = 1;
			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if (flag_control == 1) {

						data[i] = (byte) (data[i] + flag);
						flag_control = 2;
					} else if (flag_control == 2) {

						data[i] = (byte) (data[i] - flag_1);
						flag_control = 3;
					} else if (flag_control == 3) {

						data[i] = (byte) (data[i] + flag_2);
						flag_control = 4;
					} else if (flag_control == 4) {

						data[i] = (byte) (data[i] - flag_3);
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

	void selectMethod1(String inputFileName, String outputFileName) {
		this.stoneIt(inputFileName, outputFileName);
	}

	void selectMethod2(String inputFileName, String outputFileName) {
		this.buildIt(inputFileName, outputFileName);
	}
}