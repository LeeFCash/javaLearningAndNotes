import java.util.Collections;
import java.util.*;
public class BookTest 
{
	public static void main(String[] args)
	{
		/*
		Book[] book = new Book[5];
		book[0] = new Book("title 1", "author 1", 2025, 21.00);
		book[2] = new Book("title 2", "author 2", 2024, 22.00);
		book[1] = new Book("title 3", "author 3", 2023, 23.00);
		book[4] = new Book("title 4", "author 4", 2022, 24.00);
		book[3] = new Book("title 5", "author 5", 2021, 25.00);
		*/
		ArrayList<Book> book = new ArrayList<>();
		Book book1 = new Book("title 1", "author 1", 2025, 21.00);
		Book book2 = new Book("title 2", "author 2", 2024, 22.00);
		Book book3 = new Book("title 3", "author 3", 2023, 23.00);
		Book book4 = new Book("title 4", "author 4", 2022, 24.00);
		Book book5 = new Book("title 5", "author 5", 2021, 25.00);
		book.add(book2);
		book.add(book1);
		book.add(book4);
		book.add(book3);
		book.add(book5);
		for(Book b : book) {
			System.out.println(b.getYearPublished());
		}
		Collections.sort(book);
		System.out.println("----------------------- sorted down under --------------------------------");
		for(Book b : book) {
			System.out.println(b.getYearPublished());
		}
	}
}
