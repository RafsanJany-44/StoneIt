package com.StoneIt.main;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Method_17 extends MethodController{

	private void stoneIt(String inputFileName, String outputFileName) {

		try {
			InputStream inputFile = new BufferedInputStream(new FileInputStream(new File(inputFileName)));
			OutputStream outputFile = new BufferedOutputStream(new FileOutputStream(new File(outputFileName)));

			int length = (int) new File(inputFileName).length();
			int flag=94,flag_control=(flag+93);
			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if(flag==flag_control) {
						flag=flag-93;
					}
					data[i] = (byte) (data[i] - flag);
					flag++;
					

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
			int flag=94,flag_control=(flag+93);
			byte[] data = new byte[length];
			while ((inputFile.read(data)) != -1) {
				for (int i = 0; i < length; i++) {

					if(flag==flag_control) {
						flag=flag-93;
					}
					data[i] = (byte) (data[i] + flag);
					flag++;

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