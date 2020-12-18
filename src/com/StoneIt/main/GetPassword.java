package com.StoneIt.main;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;
import java.awt.Color;

public class GetPassword extends JDialog { //give exact 8 characters + integers
	static String pass = null;
	private JPanel contentPanel = new JPanel();
	private JPasswordField passwordField;
	JButton okButton = new JButton("OK");

	/**
	 * Exact 8 characters
	 */
	// public static void main(String[] args) {
	// try {
	// GetPassword dialog = new GetPassword();
	// dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	// dialog.setVisible(true);
	// } catch (Exception e) {
	// e.printStackTrace();
	// }
	// }
	//
	/**
	 * Create the dialog.
	 */
	public GetPassword() {
		setResizable(false);
		getContentPane().setBackground(new Color(204, 255, 255));

		setTitle("Enter your Password");
		setModal(true);
		setLocationRelativeTo(null);
		setSize(400, 200);
		getContentPane().setLayout(null);
		contentPanel.setBackground(new Color(204, 255, 255));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPanel.setSize(358,90);
		contentPanel.setLocation(12,13);
		
		getContentPane().add(contentPanel);
		{
			passwordField = new JPasswordField(8);
			passwordField.setBounds(51, 40, 259, 37);
			passwordField.addKeyListener(new KeyAdapter() {
				@Override
				public void keyReleased(KeyEvent e) {
					if (passwordField.getText().length() ==8) {
						okButton.setEnabled(true);
					} else {
						okButton.setEnabled(false);
					}
					
					
				}
			});
			contentPanel.setLayout(null);
			
			JLabel lblNewLabel = new JLabel("Enter your Password (Exact 8 characters): ");
			lblNewLabel.setBounds(12, -10, 342, 37);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 18));
			contentPanel.add(lblNewLabel);
			passwordField.setEchoChar('*');
			passwordField.setFont(new Font("Arial", Font.BOLD, 20));
			contentPanel.add(passwordField);

			PlainDocument document = (PlainDocument) passwordField.getDocument();
			document.setDocumentFilter(new DocumentFilter() {

				public void replace(DocumentFilter.FilterBypass fb, int offset, int length, String text,
						javax.swing.text.AttributeSet attrs) throws BadLocationException {
					String string = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;

					if (string.length() <= 8) {
						super.replace(fb, offset, length, text, attrs);
					}
				}

			});

		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBackground(new Color(204, 255, 255));
			buttonPane.setBounds(47, 102, 298, 51);
			buttonPane.setFont(new Font("Arial", Font.PLAIN, 18));
			getContentPane().add(buttonPane);
			{
				okButton.setFont(new Font("Arial", Font.PLAIN, 18));

				okButton.setEnabled(false);
				okButton.setSize(125, 40);
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						if (passwordField.getText().isEmpty()) {
							pass = null;
						} else {
							pass = passwordField.getText();
						}

						dispose();
					}
				});
				buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 10));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.setFont(new Font("Arial", Font.PLAIN, 18));
				cancelButton.setSize(125, 40);
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pass = null;
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
