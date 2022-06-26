package library;
import java.time.*;
import java.util.*;
public class Library{
	private ArrayList<LibraryAccount> accounts = new ArrayList<LibraryAccount>();
	
	Library(){
	//	accounts.add(new LibraryAccount(LocalDate.parse("2017-11-10"),LocalDate.parse("2023-11-10"),"123456","Jeff","Bezos",new Addresse("India","Karnataka","Bangalore","Yelahanka")));
	}
	
	public void addAccount(LibraryAccount acc) {
		accounts.add(acc);
		
	}
}
