package GUI;
import java.awt.Font;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.time.LocalDate;
import library.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.sql.*;

public class BorrowBook extends JFrame {
	private String title;
	private JPanel contentPane;
	private JTextField search;
	public BorrowBook() {
		setResizable(false);
		setTitle("Borrow Book");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setForeground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JLabel lblTitle = new JLabel("Search for book to borrow");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblTitle.setBounds(0, 69, 613, 59);
		contentPane.add(lblTitle);
		
		search = new JTextField();
		search.setBounds(215,200,200,30);
		contentPane.add(search);
		
		
		JButton searchButton = new JButton("Search");
		searchButton.setBounds(260,270,120,30);
		
		searchButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				title = search.getText().toString();
				String db_isbn="";
				try {
					db_isbn = doDBBookSearch(title);
				}
				catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(!db_isbn.equals("")) {
					System.out.println(title);
					System.out.println(db_isbn);
					
					try {
						dbAddToBasket(db_isbn);
					}
					catch(Exception e) {
						e.printStackTrace();
					}
					JOptionPane.showMessageDialog(getComponent(0), "Book Added To Shopping Cart");
					
					search.setText("");
					//GUIForm.account.basket.add(new Book(title,db_isbn));
					System.out.println("adding"+title+"to basket");
					GUIForm.account.basket.printBooks();
				}
				else {
					System.out.println(title);
					JOptionPane.showMessageDialog(getComponent(0), "Book not found","Error",0);
					search.setText("");
				}
			}

			
		});
		
		contentPane.add(searchButton);
		
		JButton exit = new JButton("Exit");
		exit.setBounds(260,320,120,30);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		contentPane.add(exit);
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
	
	String doDBBookSearch(String searchTitle) throws Exception{
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		String query = "select * from Book";
				
				
		System.out.println(query);
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String dbBookTitle="";
		String dbISBN="";
		while(rs.next()) {
			dbBookTitle=rs.getString(1);
			
			if(dbBookTitle.equals(searchTitle)) {
				dbISBN=rs.getString(2);
			}
		}
		
		st.close();
		con.close();
		
		return dbISBN;
	}
	
	public void dbAddToBasket(String isbn) throws Exception{
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		String query = "insert into Basket values(?,?)";
				
		Connection con = DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setString(1,GUIForm.account.username);
		st.setString(2,isbn);
		int count = st.executeUpdate();
		
		st.close();
		con.close();
		
	}
}
