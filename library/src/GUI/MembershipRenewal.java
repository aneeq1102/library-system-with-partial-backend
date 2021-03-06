package GUI;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
public class MembershipRenewal extends JFrame{
		int btnWidth = 124;
		int btnHeight = 40;
		private JPanel contentPane;
		JButton month_1;
		JButton month_3;
		JButton month_6;
		JButton month_12;
		JButton month_36;
	
		JLabel discountLabel_3;
		JLabel discountLabel_6;
		JLabel discountLabel_12;
		JLabel discountLabel_36;
		
		JLabel priceMonth_1;
		JLabel priceMonth_3;
		JLabel priceMonth_6;
		JLabel priceMonth_12;
		JLabel priceMonth_36;
		
		JLabel saleIcon;
		
		JButton returnAcctPg;
		
		MembershipRenewal(){
			setResizable(false);
			setTitle("Renew Membership");
			setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			setBounds(100, 100, 649, 650);
			contentPane = new JPanel();
			contentPane.setBackground(new Color(116, 158, 178));
			contentPane.setForeground(SystemColor.activeCaption);
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			JLabel lblTitle = new JLabel("Membership Renewal");
			lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
			lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblTitle.setBounds(0, 69, 613, 59);
			contentPane.add(lblTitle);
			
			JLabel lblTimeLeft = new JLabel("Time left:3 Months");
			lblTimeLeft.setHorizontalAlignment(SwingConstants.CENTER);
			lblTimeLeft.setFont(new Font("Tahoma",Font.ITALIC,18));
			lblTimeLeft.setBounds(0,110,613,60);
			contentPane.add(lblTimeLeft);
			
			month_1 = new JButton("1 Month");
			month_1.setFont(new Font("Arial",Font.PLAIN,20));
			month_1.setBounds(120, 190, btnWidth,btnHeight);
			contentPane.add(month_1);
			
			month_1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GUIForm.makePayment.setVisible(true);
				}
			});
			
			month_3 = new JButton("3 Months");
			month_3.setFont(new Font("Arial",Font.PLAIN,20));
			month_3.setBounds(120,250,btnWidth,btnHeight);
			contentPane.add(month_3);
			
			month_3.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GUIForm.makePayment.setVisible(true);
				}
			});
			
			month_6 = new JButton("6 Months");
			month_6.setFont(new Font("Arial",Font.PLAIN,20));
			month_6.setBounds(120, 310, btnWidth, btnHeight);
			contentPane.add(month_6);
			
			month_6.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GUIForm.makePayment.setVisible(true);
				}
			});
			
			month_12 = new JButton("12 Months");
			month_12.setFont(new Font("Arial",Font.PLAIN,17));
			month_12.setBounds(120,370,btnWidth,btnHeight);
			contentPane.add(month_12);
			
			month_12.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GUIForm.makePayment.setVisible(true);
				}
			});
			
			
			month_36 = new JButton("36 Months");
			month_36.setFont(new Font("Arial",Font.PLAIN,17));
			month_36.setBounds(120,430,btnWidth,btnHeight);
			contentPane.add(month_36);
			
			month_36.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					GUIForm.makePayment.setVisible(true);
				}
			});
			
			discountLabel_3 = new JLabel("10% discount!");
			discountLabel_3.setForeground(Color.RED);
			discountLabel_3.setFont(new Font("Arial",Font.ITALIC,15));
			discountLabel_3.setBounds(410, 250, 120, 40);
			contentPane.add(discountLabel_3);
			
			discountLabel_6 = new JLabel("20% discount!");
			discountLabel_6.setForeground(Color.RED);
			discountLabel_6.setFont(new Font("Arial",Font.ITALIC,15));
			discountLabel_6.setBounds(410, 310, 120, 40);
			contentPane.add(discountLabel_6);

			discountLabel_12 = new JLabel("30% discount!");
			discountLabel_12.setForeground(Color.RED);
			discountLabel_12.setFont(new Font("Arial",Font.ITALIC,15));
			discountLabel_12.setBounds(410, 370, 120, 40);
			contentPane.add(discountLabel_12);
			
			discountLabel_36 = new JLabel("60% discount!");
			discountLabel_36.setForeground(Color.RED);
			discountLabel_36.setFont(new Font("Arial",Font.ITALIC,15));
			discountLabel_36.setBounds(410, 430, 120, 40);
			contentPane.add(discountLabel_36);
			
			priceMonth_1 = new JLabel("\u20B92000");
			priceMonth_1.setBounds(280, 190, 80, 40);
			priceMonth_1.setFont(new Font("Arial",Font.ITALIC,20));
			contentPane.add(priceMonth_1);
			
			priceMonth_3 = new JLabel("\u20B95400");
			priceMonth_3.setBounds(280, 250, 80, 40);
			priceMonth_3.setFont(new Font("Arial",Font.ITALIC,20));
			contentPane.add(priceMonth_3);
			
			priceMonth_6 = new JLabel("\u20B99600");
			priceMonth_6.setBounds(280, 310, 80, 40);
			priceMonth_6.setFont(new Font("Arial",Font.ITALIC,20));
			contentPane.add(priceMonth_6);
			
			priceMonth_12 = new JLabel("\u20B916800");
			priceMonth_12.setBounds(280, 370, 80, 40);
			priceMonth_12.setFont(new Font("Arial",Font.ITALIC,20));
			contentPane.add(priceMonth_12);
			
			priceMonth_36 = new JLabel("\u20B919200");
			priceMonth_36.setBounds(280, 430, 80, 40);
			priceMonth_36.setFont(new Font("Arial",Font.ITALIC,20));
			contentPane.add(priceMonth_36);
			
			saleIcon = new JLabel();
			
			ImageIcon saleImg = new ImageIcon("D:\\sem6\\java lab\\icons8-best-seller-48.png");
			saleIcon.setIcon(saleImg);
			saleIcon.setBounds(35,430,48,48);
			contentPane.add(saleIcon);
		
			returnAcctPg = new JButton("Exit");
			returnAcctPg.setBounds(250, 530, btnWidth-30, btnHeight-10);
			contentPane.add(returnAcctPg);
			
			returnAcctPg.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
	
					dispose();
				}
			});
			Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
			setIconImage(icon);
		}
}


