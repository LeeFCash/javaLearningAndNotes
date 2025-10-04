//public class BankAccount implements Measurable, Comparable
public class Book implements Comparable<Book> {
	private String title;
	private String author;
	private int yearPublished;
	private double price;
	Book(String title, String author, int yearPublished, double price){
		this.title = title;
		this.author = author;
		this.yearPublished = yearPublished;
		this.price = price;
	}
	// getters
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
	public int getYearPublished() {
		return yearPublished;
	}
	public double getPrice() {
		return price;
	}
	// setters 
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public void setYearPublished(int yearPublished) {
		this.yearPublished = yearPublished;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int compareTo(Book other) {
		/*
		did use AI but I did not copy from it.
		what I did is have it explain the stuff I did not understand from the BankAccount.java = InterfaceDemo2 and did not have it do the work for me.
		*/
		Book otherO = (Book) other;
		if(this.yearPublished < otherO.yearPublished){
			return -1;
		} else if(this.yearPublished > otherO.yearPublished){
			return 1;
		} else {
			return 0;
		}
	}
}
