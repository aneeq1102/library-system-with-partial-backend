package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MakePayment extends JFrame {
	JTextField cardNumberField;
	JTextField cardNameField;
	JPanel contentPane;
	MakePayment(){
		contentPane = new JPanel();
		setResizable(false);
		setBounds(100, 100, 450, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Enter payment details");
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(196, 174, 120));
		JLabel title = new JLabel("Enter payment details");
		title.setFont(new Font("Tahoma", Font.BOLD, 17));
		title.setBounds(110, 11, 300, 41);
		contentPane.add(title);
		
		JLabel lblEnterLogin = new JLabel("Enter card details");
		lblEnterLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEnterLogin.setBounds(150, 63, 150, 23);
		contentPane.add(lblEnterLogin);
		
		JLabel lblCardNum = new JLabel("Card Number:");
		lblCardNum.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCardNum.setBounds(100, 121, 100, 23);
		contentPane.add(lblCardNum);
		
		JLabel lblCardName = new JLabel("Name on card:");
		lblCardName.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCardName.setBounds(100, 161, 100, 23);
		contentPane.add(lblCardName);
		
		JLabel lblCVV = new JLabel("cvv:");
		lblCVV.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblCVV.setBounds(100, 201, 100, 23);
		contentPane.add(lblCVV);
		
		JLabel lblExpDate = new JLabel("Exipration Date");
		lblExpDate.setFont(new Font("Tahoma",Font.PLAIN,13));
		lblExpDate.setBounds(100,241,100,23);
		contentPane.add(lblExpDate);
		
		cardNumberField = new JTextField();
		cardNumberField.setBounds(200, 121, 130, 20);
		contentPane.add(cardNumberField);
		cardNumberField.setColumns(10);
		
		
		cardNameField = new JTextField();
		cardNameField.setBounds(200, 161, 130, 20);
		contentPane.add(cardNameField);
		cardNameField.setColumns(10);
		
		JTextField cvvField = new JTextField();
		cvvField.setBounds(200,201,130,20);
		contentPane.add(cvvField);
		cvvField.setColumns(10);
		
		JTextField expirationField = new JTextField();
		expirationField.setBounds(200,241,130,20);
		contentPane.add(expirationField);
		expirationField.setColumns(10);
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(110,300,80,25);
		contentPane.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cardNo = cardNumberField.getText();
				String Name = cardNameField.getText();
				String cvv = cvvField.getText();
				String expDate = expirationField.getText();
				
				if(cardNo.equals("") || Name.equals("") || cvv.equals("") || expDate.equals("")) {
					JOptionPane.showMessageDialog(getComponent(0), "one or more fields are empty","Error",0);
				
				}
				else if(!creditCardCheck(cardNo)) {
					JOptionPane.showMessageDialog(getComponent(0), "credit card number invalid","Error",0);
				}
				else if(!cvvCheck(cvv)) {
					JOptionPane.showMessageDialog(getComponent(0), "cvv is invalid","Error",0);
				}
				else {
					JOptionPane.showMessageDialog(getComponent(0), "Membership duration extended","Error",0);
					dispose();
				}
				
			}
		});
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(250,300,80,25);
		contentPane.add(btnCancel);
		
		btnCancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
	Boolean creditCardCheck(String cardNo) {
		if(cardNo.length() == 16 && cardNo.matches("[0-9]+")) {
			return true;
		}
		return false;
	}
	
	Boolean cvvCheck(String cvv) {
		if(cvv.length() == 3 && cvv.matches("[0-9]+")) {
			return true;
		}
		return false;
	}
	
}
