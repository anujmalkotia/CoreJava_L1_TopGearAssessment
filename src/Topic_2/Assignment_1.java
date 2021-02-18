package Topic_2;

public class Assignment_1 {

	public static void main(String[] args) {
		Book book = new Book(312, "Physics", "RS Arora", 4200);
		book.displaydeta_ils();
		book.discountedprice(20);
		

	}

}

class Book
{
	int isbn;
	String title, author;
	int price;
	public Book(int isbn, String title, String author, int price) {
		super();
		this.isbn = isbn;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	public void displaydeta_ils()
	{
		System.out.println("isbn:" + isbn + " \n title:" + title + "\n author:" + author + "\n price:" + price);
	}
	
	public void  discountedprice(int discount)
	{
		int final_price = price - ((discount/100)*price);
		System.out.println("Final Price:" + final_price);
		
	}
	
		
}
