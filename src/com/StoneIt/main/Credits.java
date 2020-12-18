package com.StoneIt.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Cursor;

public class Credits extends JFrame {

	private JPanel contentPane;
	private JTextField txtTeamStoneit;
	private JLabel lblcredits = new JLabel();;

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Credits frame = new Credits();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					JOptionPane.showMessageDialog(null, "Something went WRONG!!!!\nPlease try again..\n"+e, "Error", JOptionPane.ERROR_MESSAGE);
//					System.exit(0);
//				}
//			}
//		});
//	}

	public Credits() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
		setTitle("Credits");
		setSize(700,400);
		setForeground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setLocationRelativeTo(null);
		
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setFont(new Font("Arial", Font.PLAIN, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblcredits.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblcredits.setText("<html>\r\n<h2>Credits :</h2>\r\n<p>&nbsp;</p>\r\n<p>Rafsan Jany (170042044)</p>\r\n<p>Md Nishat Ishmum (170042027)</p>\r\n<p>Suzad Mohammad (170042024)</p>\r\n<p>&nbsp;</p>\r\n<p>Department : Computer Science and Engineering</p>\r\n<p>Program : Software Engineering</p>\r\n<p>Islamic University of Technology (IUT) </p>\r\n<p>Gazipur , Dhaka , Bangladesh</p>\r\n<p>&nbsp;</p>\r\n</html>");
		lblcredits.setToolTipText("");
		lblcredits.setBackground(new Color(204, 255, 255));
		lblcredits.setFont(new Font("Arial", Font.PLAIN, 18));
		
		JScrollPane scrollPane = new JScrollPane(lblcredits);
		scrollPane.setBorder(null);
		scrollPane.setBounds(40, 0, 655, 365);
		contentPane.add(scrollPane);
		scrollPane.getViewport().setBackground(new Color(204, 255, 255));
		
		txtTeamStoneit = new JTextField();
		txtTeamStoneit.setDisabledTextColor(new Color(0, 0, 0));
		txtTeamStoneit.setEnabled(false);
		txtTeamStoneit.setEditable(false);
		txtTeamStoneit.setBorder(new EmptyBorder(10, 10, 10, 10));
		txtTeamStoneit.setBackground(new Color(204, 255, 255));
		txtTeamStoneit.setFont(new Font("Arial", Font.BOLD, 23));
		txtTeamStoneit.setHorizontalAlignment(SwingConstants.CENTER);
		txtTeamStoneit.setText("Team StoneIt");
		scrollPane.setColumnHeaderView(txtTeamStoneit);
		txtTeamStoneit.setColumns(10);
		
		scrollPane.setViewportView(lblcredits);
	}
}
