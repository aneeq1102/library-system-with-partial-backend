package library;
import java.time.*;
public class Book {
	public Book(String title,String isbn) {
		this.title=title;
		this.isbn=isbn;
		this.publish_date = LocalDate.of(2017, 10, 10);
	}
	String title;
	String isbn;
	LocalDate publish_date;
	
}
