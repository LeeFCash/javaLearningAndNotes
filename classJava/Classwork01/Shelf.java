import java.util.ArrayList;
public class Shelf {
	//blic int pages;
	//lic String dateAdded;
	private ArrayList<Book> books;
	public Shelf(){
		this.books = new ArrayList<>();
	}
	public void addBook(Book book){
		books.add(book);
	}
	public String display(){
		String list = "";
		for(Book book : books){
			//System.out.println(item.getName() + "   "+ item.getPrice());
			list += book.getTitle() + "   "+ book.getAuthor() +"\n";
        	}
        return list;
	}
}
