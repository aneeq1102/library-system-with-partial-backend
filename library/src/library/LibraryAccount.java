package library;

import java.time.*;
public class LibraryAccount {
	public LibraryAccount(LocalDate start,LocalDate end,String accountNum,String fname,String lname,Addresse add){
		this.membershipStartDate=start;
		this.membershipEndDate = end;
		this.accountNum = accountNum;
		this.fName=fname;
		this.lName=lname;
		this.add=add;
		this.basket = new ShoppingBasket();
		this.inTransit = new OrdersCurrentlyBeingDelivered();
		
	}
	LocalDate membershipStartDate;
	LocalDate membershipEndDate;
	String accountNum;
	String fName;
	String lName;
	Addresse add;
	public ShoppingBasket basket;
	public OrdersCurrentlyBeingDelivered inTransit;
	public String username="00001";
	public String password;
	
}
