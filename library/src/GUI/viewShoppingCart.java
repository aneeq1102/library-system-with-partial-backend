package GUI;
import java.awt.Font;
import java.sql.*;
import java.awt.Image;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import library.LibraryAccount;
public class viewShoppingCart extends JFrame {
	static DefaultListModel<String> arr = new DefaultListModel<String>();
	private JPanel contentPane;
	JScrollPane scrollPane;
	JList<String> list;
	JTextField search;
	JButton remove;
	JLabel desc;
	String toRemove;
	JButton exit;
	JButton checkoutAll;
	/**
	 * Create the frame.
	 */
	@SuppressWarnings({ })
	public viewShoppingCart() {
		setResizable(false);
		setTitle("Shopping Basket");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 649, 600);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAccountList = new JLabel("Shopping Basket");
		lblAccountList.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAccountList.setHorizontalAlignment(SwingConstants.CENTER);
		lblAccountList.setBounds(0, 11, 623, 31);
		contentPane.add(lblAccountList);
		
		scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 66, 613, 358);
		contentPane.add(scrollPane);
		
		desc = new JLabel("Enter book title to remove:");
		desc.setBounds(25,450,180,30);
		contentPane.add(desc);
		
		search = new JTextField();
		search.setBounds(200,450,200,30);
		contentPane.add(search);
		
		remove = new JButton("Remove from basket");
		remove.setBounds(420,450,180,30);
		contentPane.add(remove);
		
	
		
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 toRemove = search.getText().toString();
				 System.out.println("to remove:::"+toRemove);
				 Boolean removed=false;
				 if(toRemove.equals("")) {
					 JOptionPane.showMessageDialog(getComponent(0), "Nothing Entered", "Warning", 3);
				 }
				 else {
					 try {
						removed = GUIForm.account.basket.removeBook(toRemove);
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					setScrollPane();
					if(removed) {
					
						JOptionPane.showMessageDialog(getComponent(0), "Removed book "+toRemove+" from shopping basket");
					}
					else {
						JOptionPane.showMessageDialog(getComponent(0), "book not found in shopping basket");
					}
				}
			}
		});
		try {
			arr=GUIForm.account.basket.dbRetrieveBooks();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//viewing  list books
		System.out.println("viewing defualt list model books");
		System.out.println(arr.getSize());
		list = new JList<String>(arr);
		
		
		scrollPane.setViewportView(list);
		
	
		exit = new JButton("Exit");
		exit.setBounds(250,510,130,30);
		contentPane.add(exit);
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		checkoutAll = new JButton("Checkout all books");
		checkoutAll.setBounds(25,510,200,30);
		contentPane.add(checkoutAll);
		
		checkoutAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					GUIForm.account.basket.emptyShoppingBasket();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				setScrollPane();
				JOptionPane.showMessageDialog(getComponent(0),"All books in shopping cart have been checked out and will be delivered shortly","Success",1);
				dispose();
			}
		});
		Image icon = Toolkit.getDefaultToolkit().getImage("D:\\sem6\\java lab\\Map_karnataka_flag - Copy_resized.png");   
		setIconImage(icon);
	}
	
	public void transferToHistory() throws Exception{
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		String query = "select title from Book where isbn in(select book_id from Basket where userName=" + GUIForm.account.username + ")";
		String query2 = "insert into History values(?)";
				
		System.out.println(query);
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String dbBookTitle;
		int count;
		while(rs.next()) {
			dbBookTitle=rs.getString(1);
			PreparedStatement pst = con.prepareStatement(query2);
			pst.setString(1,dbBookTitle);
			count = pst.executeUpdate();
		}
		
		st.close();con.close();
	}
	
	public void setScrollPane() {
		try {
			arr=GUIForm.account.basket.dbRetrieveBooks();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		list = new JList<String>(arr);
		
		
		scrollPane.setViewportView(list);
	}
	

}
