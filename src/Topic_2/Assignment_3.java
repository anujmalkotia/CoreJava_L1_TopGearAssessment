package Topic_2;

public class Assignment_3 {

	public static void main(String[] args) {
		Magazine mg = new Magazine("112msd", "CHEMISTRY", 2300, "Study");
		System.out.println(mg);
		System.out.println("----------------------");
		Novel nv = new Novel("123aa", "Maths", 1244, "RS AGARWAL");
		System.out.println(nv);

	}

}

class Books 
{
	String isbn,title;
	public Books(String isbn, String title, int price) {
		this.isbn = isbn;
		this.title = title;
		this.price = price;
	}
	int price;
	
}

class Magazine extends Books
{
	String type;

	public Magazine(String isbn, String title, int price, String type) {
		super(isbn, title, price);
		this.type = type;
	}
	
	public String toString()
	{
		return isbn + "\n" + title + "\n"  + price + "\n"  + type;
	}
	
	
}

class Novel extends Books
{
	String author;

	public Novel(String isbn, String title, int price, String author) {
		super(isbn, title, price);
		this.author = author;
	}
	public String toString()
	{
		return isbn+ "\n"  + title+ "\n"  + price+ "\n"  + author;
	}
	
}
