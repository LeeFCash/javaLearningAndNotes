public class Book {
	public String title;
	public String author;
	//public final ArrayList<book> books;
	public Book(String title, String author){
		this.title = title;
		this.author = author;
	}
	// setter(s) 
	public void setTitle(String title){
		this.title = title;
	}
	public void setAuthor(String author){
		this.author = author;
	}
	// getters 
	public String getTitle() {
		return title;
	}
	public String getAuthor() {
		return author;
	}
}
