package library;
import java.sql.*;
import java.time.LocalDate;
import java.util.*;

import javax.swing.DefaultListModel;

import GUI.GUIForm;
public class ShoppingBasket {
	private ArrayList<Book> books = new ArrayList<Book>();
	
	ShoppingBasket() {
		books.add(new Book("moby dick","12345"));
		books.add(new Book("gullivers travels","1678"));	
	}
	
	public void add(Book b) {
		System.out.println("added to array"+b.title);
		
		books.add(b);
	}
	
	public void printBooks() {
		for(Book b:books) {
			System.out.println(b.title);
		}
	}
	
	public void emptyShoppingBasket() throws Exception{
		
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		
		String query = "delete from Basket where userName = "+ GUIForm.account.username;
		String dbBasketTitle;
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		st.close();
		con.close();
		
		
		
		
	}
	
	public Boolean removeBook(String title) throws Exception {
		
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		String query = "delete w from Basket w INNER JOIN Book b on book_id=isbn where title='"+title+"' and userName="+"'"+GUIForm.account.username+"'";
		
		System.out.println(query);
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		st.close();
		con.close();
		
		
		if(count==0) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public DefaultListModel<String> dbRetrieveBooks() throws Exception{

		DefaultListModel<String> dbBooks=new DefaultListModel<String>();
		int i;
//		String type=null;
		System.out.println("reading username shopping cart books from database");
		
		String url = "jdbc:mysql://localhost:3306/libsys";
		String uname = "root";
		String pass = "aneeq1102";
		String query = "select title from Book where isbn in(select book_id from Basket where userName = " + GUIForm.account.username + ")";
		
		
		
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		String dbBook = "";
		while(rs.next()) {
			dbBook = rs.getString(1);
			System.out.println(dbBook);
			dbBooks.addElement(dbBook);
		}
		
		
		st.close();
		con.close();
		
		return dbBooks;
		
	//	for(Book x:books) {
	//		System.out.println(x.title);
	//	}
	//	for(i=0;i<books.size();i++)
	//	{
			
//			if(getAccounts()[i].getClass().toString().equals("class Bank.SavingsAccount"))
//			{
//				type="Type: Savings Account";
//			}
//			
//			else if(getAccounts()[i].getClass().toString().equals("class Bank.CurrentAccount"))
//			{
//				type="Type: Current Account";
//			}
//			
//			else if(getAccounts()[i].getClass().toString().equals("class Bank.StudentAccount"))
//			{
//				type="Type: Student Account";
//			}
			
		//	list.addElement(books.get(i).title.toString());
			
			
	//	}
		
	
	}
}
