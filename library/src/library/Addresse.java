package library;

public class Addresse {
	public Addresse(String country,String state,String city,String district,String landmark) {
		this.country=country;
		this.state=state;
		this.city=city;
		this.district=district;
		this.landmark=landmark;
	}
	
	public Addresse(String country,String state,String city,String district) {
		this.country=country;
		this.state=state;
		this.city=city;
		this.district=district;
		this.landmark="NULL";
	}
	
	String country="India";
	String state;
	String city;
	String district;
	String landmark;
}
