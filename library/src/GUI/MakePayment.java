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
		
		
		
		cardNumberField = new JTextField();
		cardNumberField.setBounds(200, 121, 130, 20);
		contentPane.add(cardNumberField);
		cardNumberField.setColumns(10);
		
		
		
		
		
		
		
		
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setBounds(110,300,80,25);
		contentPane.add(btnSubmit);
		
		btnSubmit.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String cardNo = cardNumberField.getText();
				
				
				if(cardNo.equals("")) {
					JOptionPane.showMessageDialog(getComponent(0), "Field is empty","Error",0);
				
				}
				else if(!creditCardCheck(cardNo)) {
					JOptionPane.showMessageDialog(getComponent(0), "credit card number invalid","Error",0);
				}
				
				else {
					JOptionPane.showMessageDialog(getComponent(0), "Membership duration extended","Success",1);
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
