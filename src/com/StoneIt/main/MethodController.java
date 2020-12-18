package com.StoneIt.main;

import javax.swing.JOptionPane;

public class MethodController {

	void selectMethod1(String inputFileName, String outputFileName) {

	}

	void selectMethod2(String inputFileName, String outputFileName) {

	}

	void setPassword(String passWord) {
		
	}
	void showCompleteMessage() {
		JOptionPane.showMessageDialog(null, "Complete", "Message", JOptionPane.INFORMATION_MESSAGE);
	}
	void errorMessage() {
		JOptionPane.showMessageDialog(null, "Something went WRONG!!!!\nPlease try again..", "Error", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}
	void fileNotFoundmessage() {
		JOptionPane.showMessageDialog(null, "File not found!!!!\nPlease try again..", "Error", JOptionPane.ERROR_MESSAGE);
		System.exit(0);
	}

//	 public static void main(String[] args) {
//	 MethodController a = new MethodController();
////	 JFrame frame1 = new JFrame();
////	 frame1.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
////	 frame1.setVisible(true);
////	 frame1.setLocationRelativeTo(null);
////	 JOptionPane.showMessageDialog(frame1, "Please wait...", "Processing..",
////	 JOptionPane.CANCEL_OPTION);
//	 a.showLoadingMessage();
////	 frame1.dispose();
//	 a.showCompleteMessage();
//	 a.errorMessage();
//	 }

}
