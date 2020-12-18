package com.StoneIt.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Cursor;

public class About extends JFrame {

	private JPanel contentPane;
	JLabel lblAbout = new JLabel("About");

	// public static void main(String[] args) {
	// EventQueue.invokeLater(new Runnable() {
	// public void run() {
	// try {
	// About frame = new About();
	// frame.setVisible(true);
	// } catch (Exception e) {
	// JOptionPane.showMessageDialog(null, "Something went WRONG!!!!\nPlease try
	// again..\n"+e, "Error", JOptionPane.ERROR_MESSAGE);
	// System.exit(0);
	// }
	// }
	// });
	// }

	public About() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
		setTitle("About StoneIt");
		setSize(800, 450);
		setLocationRelativeTo(null);
		setForeground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 20));

		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFont(new Font("Arial", Font.PLAIN, 20));
		setContentPane(contentPane);


		JLabel lblStoneit = new JLabel("StoneIt");
		lblStoneit.setBackground(new Color(204, 255, 255));
		lblStoneit.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblStoneit.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStoneit.setHorizontalAlignment(SwingConstants.CENTER);

		lblStoneit.setBounds(351, 13, 100, 50);
		lblStoneit.setFont(new Font("Arial", Font.BOLD, 27));
		contentPane.setLayout(null);
		contentPane.add(lblStoneit);

		JLabel lblStoneYour = new JLabel("Stone your secrets");
		lblStoneYour.setHorizontalTextPosition(SwingConstants.CENTER);
		lblStoneYour.setHorizontalAlignment(SwingConstants.CENTER);
		lblStoneYour.setBounds(301, 53, 200, 30);
		lblStoneYour.setFont(new Font("Arial", Font.BOLD, 17));
		contentPane.add(lblStoneYour);
		lblAbout.setAutoscrolls(true);


		JScrollPane scrollPane = new JScrollPane(lblAbout);
		scrollPane.setFont(new Font("Arial", Font.PLAIN, 18));
		scrollPane.setBounds(40, 100, 755, 315);
		scrollPane.setBorder(null);
		scrollPane.getViewport().setBackground(new Color(204, 255, 255));
		contentPane.add(scrollPane);
		lblAbout.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblAbout.setBorder(null);
		lblAbout.setText("<html>\r\n  <h2>Description :</h2>\r\n<p>This is an encrypting, decrypting software. This software can  encrypt and decrypt any</p>\r\n<p>file in  some simple ways. The software moreover gives the opportunity to  its user to </p>\r\n<p>choose  any out of numerous ways to decrypt and encrypt his or her file .</p>\r\n<p>&nbsp;</p>\r\n<h2>Platform :</h2>\r\n<p>StoneIt is made with  java programming language. Java Swing is used to design the</p>\r\n<p>graphical user interface (GUI) of StoneIt.</p>\r\n<p>&nbsp;</p>\r\n<h2>Future plan :</h2>\r\n<li>  An updated version of this software will be available at every 6 month.</li>\r\n<li>  APK version of this software will soon be available.</li>\r\n<h2>Why StoneIt ? :</h2>\r\n<p>This  software  gives  its  user  the assurance  of keeping stoned  file  safe and  secured.</p>\r\n<p>StoneIt is designed in such a way that it is complex for an outsider to handle a stonned</p>\r\n<p>file.  Moreover,   StoneIt   returns  the  exact  same  file  which  was  previously  stonned</p>\r\n<p>by its building option.</p>\r\n<p>&nbsp;</p>\r\n<p>Release date :&nbsp; 05-11-18</p>\r\n<p>Version :&nbsp; 01.18.1B.2C.01</p>\r\n<p>&nbsp;</p>\r\n<p>Contact us : www.stoneit242744@gmail.com</p>\r\n<p>@All rights reserved to the Team StoneIt.</p>\r\n<p>&nbsp;</p>\r\n</html>");
		lblAbout.setBackground(new Color(204, 255, 255));
		lblAbout.setFont(new Font("Arial", Font.PLAIN, 18));

	}
}
