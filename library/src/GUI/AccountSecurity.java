package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class AccountSecurity extends JFrame {

	
	private JPasswordField textField;
	private JPasswordField newPassField;
	private JPasswordField reNewPassField;
	JPanel contentPane;
	/**
	 * Launch the application.
	 * @throws FileNotFoundException 
//	 */
//	public static void main(String[] args) 
//	{
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					Login window = new Login();
//					window.frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the application.
	 */

	/**
	 * Initialize the contents of the frame.
	 */
	public AccountSecurity() {
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		setResizable(false);
		setBounds(100, 100, 650, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Account Security");
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(196, 174, 120));
		JLabel label = new JLabel("Account Security");
		label.setFont(new Font("Tahoma", Font.BOLD, 17));
		label.setBounds(250, 11, 300, 41);
		contentPane.add(label);
		
		JLabel lblLoginScreen = new JLabel("To change your password,enter your old password followed by the new one");
		lblLoginScreen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLoginScreen.setBounds(110, 63, 500, 23);
		contentPane.add(lblLoginScreen);
		
		JLabel lblUsername = new JLabel("Enter old Password:");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(55, 119, 120, 23);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Enter new password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(55, 159, 120, 23);
		contentPane.add(lblPassword);
		
		JLabel lblPasswordRe = new JLabel("Re-Enter new password:");
		lblPasswordRe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPasswordRe.setBounds(55, 199, 150, 23);
		contentPane.add(lblPasswordRe);
		
		textField = new JPasswordField();
		textField.setBounds(220, 121, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		newPassField = new JPasswordField();
		newPassField.setBounds(220, 161, 86, 20);
		contentPane.add(newPassField);
		newPassField.setColumns(10);
		
		reNewPassField = new JPasswordField();
		reNewPassField.setBounds(220, 201, 86, 20);
		contentPane.add(reNewPassField);
		reNewPassField.setColumns(10);
		
	
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(370, 130, 89, 23);
		contentPane.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String old = textField.getText().toString();
				String newpass = newPassField.getText().toString();
				String renewpass = reNewPassField.getText().toString();
				
				//do authentication logic here when db is built
				
				if(old.equals("") || newpass.equals("") || renewpass.equals("")) {
					JOptionPane.showMessageDialog(getComponent(0), "One or more fields are empty");
				}
				else if(!newpass.equals(renewpass)) {
					JOptionPane.showMessageDialog(getComponent(0), "New password and reentered new password do not match");
				}
				else {
					JOptionPane.showMessageDialog(getComponent(0), "Password succesfully changed!");
				}
			}
		});
		
		JButton cancel = new JButton("Cancel");
		cancel.setBounds(370,180,89,23);
		contentPane.add(cancel);
		
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}