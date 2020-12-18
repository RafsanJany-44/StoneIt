package com.StoneIt.main;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import javax.swing.JLabel;

public class Help extends JFrame {

	private JPanel contentPane;
	JLabel lblHelp = new JLabel();
	
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Help frame = new Help();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					JOptionPane.showMessageDialog(null, "Something went WRONG!!!!\nPlease try again..\n"+e, "Error", JOptionPane.ERROR_MESSAGE);
//					System.exit(0);
//				}
//			}
//		});
//	}

	public Help() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
		setTitle("Operating StoneIt");
		setSize(800,450);
		setForeground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 20));
		setLocationRelativeTo(null);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(204, 255, 255));
		contentPane.setFont(new Font("Arial", Font.PLAIN, 20));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		lblHelp.setAutoscrolls(true);
		lblHelp.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		lblHelp.setText("<html>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<h2>Operating StoneIt:</h2>\r\n<p>After opening StoneIt one can select his/her file from computer by clicking on 'Browse'</p>\r\n<p>button. One can choose the destination from computer by clicking 'Save' button. From</p>\r\n<p>'Choose any method' bar user can select any method he/she want to encrypt/decrypt with.</p>\r\n<p>&nbsp;</p>\r\n<p>The user must need to remember the method with which he/she encrypted the file.</p>\r\n<p>Because he/she will need&nbsp; the same method while decrypting the file.</p>\r\n<p>From method number 11 to 15 the user will be&nbsp; given an dialog of writing password</p>\r\n<p>according to the direction provided.&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>Finally, click on&nbsp; 'Stone It' button to encrypt the file. If user want to decrypt any encrypted</p>\r\n<p>file, same ways&nbsp; need to be followed. User need to choose same method (same password</p>\r\n<p>if needed) to decrypt&nbsp; the file. Then click on 'Build It' button to decrypt the file.</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>Remembering the convenience of user, there is a 'new' option which by clicking presents</p>\r\n<p>with&nbsp; a new StoneIt window. The 'Reset' button erases everything that is done till now from</p>\r\n<p>StoneIt window. The 'Exit' button quits the StoneIt window.</p>\r\n<p>Furthermore, user can change background color by clicking 'Change Backgroung Color'</p>\r\n<p>from 'Edit'. Similarly user can change border color by clicking 'Change Border Color' from</p>\r\n<p>'Edit'.</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>It is recommanded that for increasing safety of the file, it needs to be encrypted again and</p>\r\n<p>again using various methods.</p>\r\n<p>For instance, let we encrypted a file with a method 5. Now, the encrypted file is</p>\r\n<p>re-encrypted with another method 10. So, for obtaining actual file we need to decrypt the</p>\r\n<p>file twice. First with method 10 then the decrypted file is&nbsp; re-decrypted again by method 5.</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n<p>&nbsp;</p>\r\n</html>");
		lblHelp.setFont(new Font("Arial", Font.PLAIN, 18));
		lblHelp.setBackground(new Color(204, 255, 255));
		
		JScrollPane scrollPane = new JScrollPane(lblHelp);
		scrollPane.setBounds(40, 0, 755, 415);
		scrollPane.getViewport().setBackground(new Color(204, 255, 255));
		scrollPane.setBorder(null);
		contentPane.add(scrollPane);
		
		
		scrollPane.setViewportView(lblHelp);
		
		
		
	}
}
