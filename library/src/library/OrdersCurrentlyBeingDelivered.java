package library;
import java.time.LocalDate;
import java.util.*;

import javax.swing.DefaultListModel;
public class OrdersCurrentlyBeingDelivered {
	
	public ArrayList<Book> orders;
	
	public OrdersCurrentlyBeingDelivered() {
		orders = new ArrayList<Book>();
		orders.add(new Book("title1","isbn1"));
	}
	//private Book[] orders = new Book[100];
	
	
	public OrdersCurrentlyBeingDelivered add(Book book) {
		orders.add(book);
		return this;
	}
	

	public DefaultListModel<String> display()
	{

		DefaultListModel<String> list=new DefaultListModel<String>();
		int i;
//		String type=null;
	
		for(i=0;i<list.size();i++)
		{
			
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
			
			list.addElement(orders.get(i).toString());
			
			
		}
		return list;
	
	}
	
	
}
