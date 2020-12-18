package com.StoneIt.main;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Toolkit;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.SwingWorker;
import javax.swing.UIManager;

import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.BoxLayout;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;

import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private MethodController object;
	JDialog dialog;

	String inputFileName;
	String outputFileName;
	String selectedMethod = null;

	public static void main(String[] args) {

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {

		}

		// EventQueue.invokeLater(new Runnable(){
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Something went WRONG!!!!\nPlease try again..\n" + e, "Error",
							JOptionPane.ERROR_MESSAGE);
					System.exit(0);
				}
			}
		});
	}

	public Main() {

		JFileChooser fileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
		Color backgroundColor = new Color(204, 255, 255);

		setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
		setTitle("StoneIt");
		setForeground(Color.LIGHT_GRAY);
		setFont(new Font("Arial", Font.PLAIN, 20));

		setSize(1000, 600);

		contentPane = new JPanel();
		JPanel panel = new JPanel();
		JPanel panel_1 = new JPanel();
		JPanel panel_2 = new JPanel();
		JPanel panel_3 = new JPanel();
		JPanel panel_4 = new JPanel();
		JPanel panel_5 = new JPanel();
		JPanel panel_6 = new JPanel();
		JPanel panel_7 = new JPanel();
		JPanel panel_8 = new JPanel();
		JPanel panel_9 = new JPanel();

		JLabel lblSelectYourFile = new JLabel("Select your file : ");

		JButton btnSave = new JButton("Save");
		JButton btnEncrypt = new JButton("Stone It");

		JButton btnDecrypt = new JButton("Build It");
		JComboBox comboBox = new JComboBox();

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(204, 204, 255));
		menuBar.setForeground(Color.blue);
		menuBar.setFont(new Font("Arial", Font.PLAIN, 20));

		setJMenuBar(menuBar);

		JMenu mnFile = new JMenu("File");
		mnFile.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnFile);

		JMenuItem mntmNew = new JMenuItem("New");
		mntmNew.setIcon(new ImageIcon(Main.class.getResource("new.png")));
		mntmNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));

		mntmNew.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Main frame = new Main();
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
				frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

			}
		});
		mntmNew.setFont(new Font("Arial", Font.PLAIN, 16));
		mnFile.add(mntmNew);

		JMenuItem mntmReset = new JMenuItem("Reset");
		mntmReset.setIcon(new ImageIcon(Main.class.getResource("reset.png")));
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				textField.setText("");
				textField_1.setText("");
				comboBox.setSelectedIndex(0);
				comboBox.setEnabled(false);
				btnSave.setEnabled(false);
				btnDecrypt.setEnabled(false);
				btnEncrypt.setEnabled(false);

			}
		});
		mntmReset.setFont(new Font("Arial", Font.PLAIN, 16));
		mnFile.add(mntmReset);

		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.setIcon(new ImageIcon(Main.class.getResource("exit.png")));
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int choice = JOptionPane.showConfirmDialog(null, "Do you want to quit?", "Confirm close",
						JOptionPane.YES_NO_OPTION);
				if (choice == JOptionPane.YES_OPTION) {
					System.exit(0);
				}

			}
		});
		mntmExit.setFont(new Font("Arial", Font.PLAIN, 16));
		mnFile.add(mntmExit);

		JMenu mnEdit = new JMenu("Edit");
		mnEdit.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnEdit);

		JMenuItem mntmChangeBackgroundColor = new JMenuItem("Change Background Color");
		mntmChangeBackgroundColor.setFont(new Font("Arial", Font.PLAIN, 16));
		mntmChangeBackgroundColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Color color = new JColorChooser().showDialog(null, "Select a color", backgroundColor);
				try {
					if (!color.equals(null)) {
						panel.setBackground(color);
						panel_1.setBackground(color);
						panel_2.setBackground(color);
						panel_3.setBackground(color);
						panel_4.setBackground(color);
						panel_5.setBackground(color);
						panel_6.setBackground(color);
						panel_7.setBackground(color);
						panel_8.setBackground(color);
						panel_9.setBackground(color);
					}
				} catch (Exception e2) {

				}

			}
		});
		mnEdit.add(mntmChangeBackgroundColor);

		JMenuItem mntmChangeBorderColor = new JMenuItem("Change Border Color");
		mntmChangeBorderColor.setFont(new Font("Arial", Font.PLAIN, 16));
		mntmChangeBorderColor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Color color = new JColorChooser().showDialog(null, "Select a color", new Color(240, 240, 240));
				try {
					if (!color.equals(null)) {
						contentPane.setBackground(color);
					}
				} catch (Exception e2) {

				}

			}
		});
		mnEdit.add(mntmChangeBorderColor);

		JMenu mnHelp = new JMenu("Help");
		mnHelp.setFont(new Font("Arial", Font.PLAIN, 16));
		menuBar.add(mnHelp);

		JMenuItem mntmHelp = new JMenuItem("Operating StoneIt");
		mntmHelp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Help helpFrame = new Help();
				helpFrame.setVisible(true);

			}
		});
		mntmHelp.setIcon(new ImageIcon(Main.class.getResource("help.png")));
		mntmHelp.setFont(new Font("Arial", Font.PLAIN, 16));
		mnHelp.add(mntmHelp);

		JMenuItem mntmCreadit = new JMenuItem("Credits");
		mntmCreadit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Credits creditsFrame = new Credits();
				creditsFrame.setVisible(true);

			}
		});
		mntmCreadit.setIcon(new ImageIcon(Main.class.getResource("team.png")));
		mntmCreadit.setFont(new Font("Arial", Font.PLAIN, 16));
		mnHelp.add(mntmCreadit);

		JMenuItem mntmAbout = new JMenuItem("About StoneIt");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				About aboutFrame = new About();
				aboutFrame.setVisible(true);

			}
		});
		mntmAbout.setIcon(new ImageIcon(Main.class.getResource("about.png")));
		mntmAbout.setFont(new Font("Arial", Font.PLAIN, 16));
		mnHelp.add(mntmAbout);

		contentPane.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		textField = new JTextField();
		textField.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textField.setBackground(new Color(240, 255, 255));
		textField.setEditable(false);
		textField.setPreferredSize(new Dimension(720, 40));
		textField.setFont(new Font("Arial", Font.PLAIN, 20));

		JButton btnBrowse = new JButton("Browse");
		btnBrowse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int a = fileChooser.showOpenDialog(null);
				if (a == JFileChooser.APPROVE_OPTION) {
					inputFileName = fileChooser.getSelectedFile().getAbsolutePath();
					textField.setText(inputFileName);
					btnSave.setEnabled(true);
				}

			}
		});

		btnBrowse.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnBrowse.setPreferredSize(new Dimension(125, 40));
		btnBrowse.setFont(new Font("Arial", Font.PLAIN, 20));

		panel.setBackground(new Color(204, 255, 255));
		panel.setFont(new Font("Arial", Font.PLAIN, 20));
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 5));
		panel.add(textField);
		panel.add(btnBrowse);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		FlowLayout flowLayout_5 = (FlowLayout) panel_7.getLayout();
		flowLayout_5.setVgap(10);
		flowLayout_5.setHgap(50);
		panel_7.setBackground(new Color(204, 255, 255));
		contentPane.add(panel_7);

		JLabel lblStoneit = new JLabel("StoneIt");
		lblStoneit.setFont(new Font("Arial", Font.BOLD, 30));
		panel_7.add(lblStoneit);

		FlowLayout flowLayout_4 = (FlowLayout) panel_8.getLayout();
		flowLayout_4.setVgap(0);
		panel_8.setBackground(new Color(204, 255, 255));
		contentPane.add(panel_8);

		JLabel lblStoneYourSecrets = new JLabel("Stone your secrets");
		lblStoneYourSecrets.setFont(new Font("Arial", Font.PLAIN, 21));
		panel_8.add(lblStoneYourSecrets);

		FlowLayout flowLayout_8 = (FlowLayout) panel_9.getLayout();
		flowLayout_8.setVgap(10);
		panel_9.setBackground(new Color(204, 255, 255));
		contentPane.add(panel_9);

		JLabel label = new JLabel("   ");
		panel_9.add(label);

		FlowLayout flowLayout_7 = (FlowLayout) panel_4.getLayout();
		flowLayout_7.setVgap(0);
		panel_4.setBackground(new Color(204, 255, 255));
		contentPane.add(panel_4);

		panel_4.add(lblSelectYourFile);
		lblSelectYourFile.setPreferredSize(new Dimension(870, 40));
		lblSelectYourFile.setFont(new Font("Arial", Font.PLAIN, 20));
		contentPane.add(panel);

		FlowLayout flowLayout_6 = (FlowLayout) panel_5.getLayout();
		flowLayout_6.setVgap(0);
		panel_5.setBackground(new Color(204, 255, 255));
		contentPane.add(panel_5);

		JLabel lblSave = new JLabel("Where to save : ");
		panel_5.add(lblSave);
		lblSave.setPreferredSize(new Dimension(870, 40));
		lblSave.setFont(new Font("Arial", Font.PLAIN, 20));

		panel_1.setBackground(new Color(204, 255, 255));
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setHgap(25);
		contentPane.add(panel_1);

		textField_1 = new JTextField();
		textField_1.setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		textField_1.setBackground(new Color(240, 255, 255));
		textField_1.setEditable(false);
		panel_1.add(textField_1);
		textField_1.setPreferredSize(new Dimension(720, 40));
		textField_1.setFont(new Font("Arial", Font.PLAIN, 20));

		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int a = fileChooser.showSaveDialog(null);
				if (a == JFileChooser.APPROVE_OPTION) {
					outputFileName = fileChooser.getSelectedFile().getAbsolutePath();
					textField_1.setText(outputFileName);

					if (new File(outputFileName).exists()) {
						JOptionPane.showMessageDialog(null, "Please give different file name...", "Error",
								JOptionPane.ERROR_MESSAGE);
					} else {

						comboBox.setEnabled(true);
					}
				}

			}
		});
		btnSave.setEnabled(false);
		btnSave.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		panel_1.add(btnSave);
		btnSave.setPreferredSize(new Dimension(125, 40));
		btnSave.setFont(new Font("Arial", Font.PLAIN, 20));

		panel_6.setBackground(new Color(204, 255, 255));
		FlowLayout flowLayout_3 = (FlowLayout) panel_6.getLayout();
		flowLayout_3.setVgap(0);
		flowLayout_3.setHgap(50);
		flowLayout_3.setAlignment(FlowLayout.LEFT);
		contentPane.add(panel_6);

		JLabel lblChooseAnyMethod = new JLabel("Choose any Method :");
		panel_6.add(lblChooseAnyMethod);
		lblChooseAnyMethod.setPreferredSize(new Dimension(700, 40));
		lblChooseAnyMethod.setFont(new Font("Arial", Font.PLAIN, 20));

		panel_2.setBackground(new Color(204, 255, 255));
		FlowLayout flowLayout_2 = (FlowLayout) panel_2.getLayout();
		flowLayout_2.setVgap(10);
		flowLayout_2.setAlignment(FlowLayout.LEFT);
		flowLayout_2.setHgap(50);
		contentPane.add(panel_2);

		comboBox.setEnabled(false);
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBackground(new Color(240, 255, 255));
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int flag = 1;
				if (comboBox.getSelectedIndex() > 0) {
					selectedMethod = comboBox.getSelectedItem().toString();
					if (selectedMethod == "1") {
						object = new Method_1();
					} else if (selectedMethod == "2") {
						object = new Method_2();
					} else if (selectedMethod == "3") {
						object = new Method_3();
					} else if (selectedMethod == "4") {
						object = new Method_4();
					} else if (selectedMethod == "5") {
						object = new Method_5();
					} else if (selectedMethod == "6") {
						object = new Method_6();
					} else if (selectedMethod == "7") {
						object = new Method_7();
					} else if (selectedMethod == "8") {
						object = new Method_8();
					} else if (selectedMethod == "9") {
						object = new Method_9();
					} else if (selectedMethod == "10") {
						object = new Method_10();
					} else if (selectedMethod == "11") {
						object = new Method_11();
						GetPassword password = new GetPassword();
						password.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						password.setVisible(true);
						if (GetPassword.pass != null) {
							object.setPassword(GetPassword.pass);
						} else {
							flag = 0;
						}
					} else if (selectedMethod == "12") {
						object = new Method_12();
						GetPassword password = new GetPassword();
						password.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						password.setVisible(true);
						if (GetPassword.pass != null) {
							object.setPassword(GetPassword.pass);
						} else {
							flag = 0;
						}
					} else if (selectedMethod == "13") {
						object = new Method_13();
						GetPassword_2 password = new GetPassword_2();
						password.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						password.setVisible(true);
						if (GetPassword_2.pass != null) {
							object.setPassword(GetPassword_2.pass);
						} else {
							flag = 0;
						}
					} else if (selectedMethod == "14") {
						object = new Method_14();
						GetPassword_3 password = new GetPassword_3();
						password.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						password.setVisible(true);
						if (GetPassword_3.pass != null) {
							object.setPassword(GetPassword_3.pass);
						} else {
							flag = 0;
						}
					} else if (selectedMethod == "15") {
						object = new Method_15();
						GetPassword_3 password = new GetPassword_3();
						password.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
						password.setVisible(true);
						if (GetPassword_3.pass != null) {
							object.setPassword(GetPassword_3.pass);
						} else {
							flag = 0;
						}
					} else if (selectedMethod == "16") {
						object = new Method_16();
					} else if (selectedMethod == "17") {
						object = new Method_17();
					} else if (selectedMethod == "18") {
						object = new Method_18();
					} else if (selectedMethod == "19") {
						object = new Method_19();
					} else if (selectedMethod == "20") {
						object = new Method_20();
					}

					if (flag == 1) {
						btnDecrypt.setEnabled(true);
						btnEncrypt.setEnabled(true);
					} else {
						btnDecrypt.setEnabled(false);
						btnEncrypt.setEnabled(false);
						flag = 1;
					}

				} else {
					btnDecrypt.setEnabled(false);
					btnEncrypt.setEnabled(false);
				}
			}
		});

		comboBox.setModel(new DefaultComboBoxModel(new String[] { "Select any method", "1", "2", "3", "4", "5", "6",
				"7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20" }));
		comboBox.setSelectedIndex(0);
		comboBox.setPreferredSize(new Dimension(400, 40));
		comboBox.setFont(new Font("Arial", Font.PLAIN, 20));

		panel_2.add(comboBox);

		panel_3.setBackground(new Color(204, 255, 255));
		panel_3.setFont(new Font("Arial", Font.PLAIN, 20));
		FlowLayout flowLayout = (FlowLayout) panel_3.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		flowLayout.setVgap(10);
		flowLayout.setHgap(50);
		contentPane.add(panel_3);

		btnEncrypt.setEnabled(false);
		btnEncrypt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnEncrypt.setPreferredSize(new Dimension(125, 40));
		btnEncrypt.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_3.add(btnEncrypt);

		btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox.setEnabled(false);
				btnSave.setEnabled(false);
				btnDecrypt.setEnabled(false);
				btnEncrypt.setEnabled(false);

				if (!(new File(inputFileName).exists())) {
					object.fileNotFoundmessage();
				}
				dialog = new JDialog();
				dialog.setTitle("Processing..");
				dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
				JLabel message = new JLabel("         Please Wait....  ");
				message.setFont(new Font("Arial", Font.PLAIN, 20));
				dialog.getContentPane().add(BorderLayout.CENTER, message);
				dialog.setLocationRelativeTo(null);
				dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
				dialog.setSize(300, 100);
				dialog.setAlwaysOnTop(true);

				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
					@Override
					protected Void doInBackground() {
						object.selectMethod1(inputFileName, outputFileName);
						return null;
					}

					@Override
					protected void done() {
						dialog.dispose();
						object.showCompleteMessage();

					}
				};
				worker.execute();
				dialog.setVisible(true);
			}
		});

		btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				comboBox.setEnabled(false);
				btnSave.setEnabled(false);
				btnDecrypt.setEnabled(false);
				btnEncrypt.setEnabled(false);

				if (!(new File(inputFileName).exists())) {
					object.fileNotFoundmessage();
				}

				dialog = new JDialog();
				dialog.setTitle("Processing..");
				dialog.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("stone.png")));
				JLabel message = new JLabel("         Please Wait....  ");
				message.setFont(new Font("Arial", Font.PLAIN, 20));
				dialog.getContentPane().add(BorderLayout.CENTER, message);
				dialog.setLocationRelativeTo(null);
				dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
				dialog.setSize(300, 100);
				dialog.setAlwaysOnTop(true);

				SwingWorker<Void, Void> worker = new SwingWorker<Void, Void>() {
					@Override
					protected Void doInBackground() {
						object.selectMethod2(inputFileName, outputFileName);
						return null;
					}

					@Override
					protected void done() {
						dialog.dispose();
						object.showCompleteMessage();

					}
				};
				worker.execute();
				dialog.setVisible(true);
			}
		});

		btnDecrypt.setEnabled(false);
		btnDecrypt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDecrypt.setPreferredSize(new Dimension(125, 40));
		btnDecrypt.setFont(new Font("Arial", Font.PLAIN, 20));
		panel_3.add(btnDecrypt);

	}
}
