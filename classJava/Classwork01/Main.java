public class Main {
	public static void main(String[] args) {
		Shelf shelf1 = new Shelf();
		shelf1.addBook(new Book("name", "Author- njfjhbrgbr"));
		shelf1.addBook(new Book("name2", "Author - njfjhbrgbrrrrrrrrrrrrrrrrrrr"));
		shelf1.addBook(new Book("name3", "Author -  nnnnnnnnnnnnnnn"));
		System.out.println(shelf1.display());
	}
}
