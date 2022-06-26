package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AddAddresse extends JFrame {
	
	
	
	


	private JTextField stateField;
	private JTextField cityField;
	private JTextField districtField;
	private JTextField landmarkField;

	
	private JButton btnSubmit;
	private JButton btnReturn;
	private JCheckBox robot;
	private JCheckBox notifs;
	

	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel lblState;
	private JLabel lblCity;
	private JLabel lblDistrict;
	private JLabel lblLandmark;

	

	String state;
	String city;
	String district;
	String landmark;

	Boolean recieveNews;
	Boolean isRobot;
	JButton returntologin;
	
	
	JPanel contentPane;
	
	AddAddresse(){
		int width = 150,height = 25, x_pos_tb=330,y_pos_tb=171,offset = 42;
		int widthtf = 100,heighttf=25,x_pos_tf=185,y_pos_tf=169;
		
		contentPane = new JPanel();
		setContentPane(contentPane);
		
		setResizable(false);
		setBounds(100,100, 700, 670);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Add New Addresse");
		getContentPane().setLayout(null);
		
		JLabel lbltitle = new JLabel("Add Addresse");
		lbltitle.setFont(new Font("Tahoma", Font.BOLD, 20));
		lbltitle.setBounds(260, 20,550, 41);
		getContentPane().add(lbltitle);
		getContentPane().setBackground(new Color(196, 174, 120));
		JLabel lblLoginScreen = new JLabel("Enter new addresse");
		lblLoginScreen.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLoginScreen.setBounds(250,80, 200, 23);
		getContentPane().add(lblLoginScreen);
		
	
		


		
		stateField = new JTextField();
		stateField.setBounds(x_pos_tb, y_pos_tb+offset, width, height);
		getContentPane().add(stateField);
		stateField.setColumns(10);
		stateField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		cityField = new JTextField();
		cityField.setBounds(x_pos_tb, y_pos_tb+2*offset, width, height);
		getContentPane().add(cityField);
		cityField.setColumns(10);
		cityField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		districtField = new JTextField();
		districtField.setBounds(x_pos_tb, y_pos_tb+3*offset, width, height);
		getContentPane().add(districtField);
		districtField.setColumns(10);
		districtField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		
		landmarkField = new JTextField();
		landmarkField.setBounds(x_pos_tb, y_pos_tb+4*offset, width, height);
		getContentPane().add(landmarkField);
		landmarkField.setColumns(10);
		landmarkField.setFont(new Font(Font.SANS_SERIF,Font.PLAIN,14));
		

	

		
		lblState = new JLabel("State:");
		lblState.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblState.setBounds(x_pos_tf, y_pos_tf+offset, widthtf, heighttf);
		getContentPane().add(lblState);
		
		lblCity = new JLabel("City:");
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCity.setBounds(x_pos_tf, y_pos_tf+offset*2, widthtf, heighttf);
		getContentPane().add(lblCity);
		
		lblDistrict = new JLabel("District:");
		lblDistrict.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDistrict.setBounds(x_pos_tf, y_pos_tf+offset*3, widthtf, heighttf);
		getContentPane().add(lblDistrict);
		
		lblLandmark = new JLabel("Landmark:");
		lblLandmark.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLandmark.setBounds(x_pos_tf, y_pos_tf+offset*4, widthtf, heighttf);
		getContentPane().add(lblLandmark);


		btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSubmit.setBounds(170,y_pos_tb+offset*8,width,height);
		getContentPane().add(btnSubmit);
		
		btnReturn = new JButton("Return");
		btnReturn.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnReturn.setBounds(390,y_pos_tb+offset*8,width,height);
		getContentPane().add(btnReturn);
		
		btnReturn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dispose();
			}
		});
		
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		
				
				state = stateField.getText();
				city = cityField.getText();
				district = districtField.getText();
				landmark = landmarkField.getText();

				//
				if(state.equals("")||city.equals("")||district.equals("")||landmark.equals("")) {
					JOptionPane.showMessageDialog(null,"One or more fields are empty","Fields Incomplete", JOptionPane.ERROR_MESSAGE);					
				}

				else {
					JOptionPane.showMessageDialog(null,"Addresse succesfully added!","Congratulations", JOptionPane.INFORMATION_MESSAGE);
					dispose();
				}
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
}
