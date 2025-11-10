/*Q5. Problem:
 Create a class Book with fields:
bookId, title, author, and price.
Use:
A default constructor to print “Book object created”.
A parameterized constructor with bookId and title.

Another parameterized constructor with bookId, title, author, and price
 that calls the previous constructor using this() (constructor chaining).
Add a method display() to show book details.
Hint:
 Use this(bookId, title) inside the main constructor to reuse initialization logic.
Explanation:
 This question checks understanding of constructor chaining, which helps avoid code duplication inside multiple constructors.



*/

import java.util.*;

class Q5{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = xyz.nextInt();
		
		Book B[] = new Book[n];
		
		for(int i=0; i<n; i++){
			
			System.out.print("\nEnter Book Id : ");
			int bId = xyz.nextInt();
			
			System.out.print("\nEnter Book title: ");
			String title = xyz.next();
			
			System.out.print("\nEnter Author name: ");
			String author = xyz.next();
			
			System.out.print("\nEnter price of book: ");
			double price = xyz.nextDouble();
			
			B[i] = new Book(bId,title,author,price);
			
			B[i].DisplayBooks();
			
		}
		
		
	}
}
class Book{
	private int bId;
	private String title;
	private String author;
	private double price;
	
	public Book(){ // default constructor
		
		System.out.println("Book object created");
		
	}
	public Book(int bId,String title){ // parameterized
		
		this();//default constructor
		this.bId=bId;
		this.title=title;
		
	}
	public Book(int bId,String title,String author,double price){
		
		this.bId = bId;
		this.title = title;
		this.author= author;
		this.price = price;
		
	}
	//setter
	
	public void setBId(int bId){
		this.bId = bId;
		
	}
	public void setTitle(String title){
		
		this.title = title;
		
	}
	public void setAuthor(String author){
		this.author = author;
		
	}
	public void setPrice(double price){
		this.price = price;
		
	}
	//getter
	
	public int getBId(){
		
		return bId;
		
	}
	public String getTitle(){
		
		return title;
		
	}
	public String getAuthor(){
		
		return author;
		
	}
	public double getPrice(){
		
		return price;
		
	}
	public void DisplayBooks(){
		
		
		System.out.print("\nBook Id : " +getBId());
		System.out.print("\nBook Title : " + getTitle());
		System.out.print("\nBook Author : " + getAuthor());
		System.out.print("\nBook Price : " + getPrice());
		
	}
	
	
		
	
}

	
	
	