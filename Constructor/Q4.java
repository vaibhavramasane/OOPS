/*Q4. Problem:
 Create a class Product with fields id, name, and price.
 Implement:
A parameterized constructor to initialize product details.


A copy constructor to copy data from another object.
 Display both objects to confirm the copy works.
Hint:
 Use Product(Product p) to copy fields.
Explanation:
 This question checks understanding of how to duplicate object data using a copy constructor.
*/

import java.util.*;
class Product {
    private int id;
    private String name;
    private double price;
    
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    public Product(Product p) {
        this.id = p.id;
        this.name = p.name;
        this.price = p.price;
    }
	
	//setter 
	public void setID(int id){
		
		this.id = id;
		
	}
	
	public void setName(String name){
		
		this.name = name;
		
	}
	
	public void setPrice(double price){
		
		this.price = price;
		
	}
	
	//getter 
	
	public int getID(){
		
		return id;
		
	}
	
	public String getName(){
		
		return name;
		
	}
	
	public double getPrice(){
		
		return price;
		
	}
	
    
    public void displayProductDetails() {
        System.out.println("Product ID: " + getID());
        System.out.println("Product Name: " + getName());
        System.out.println("Product Price: " + getPrice());
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = xyz.nextInt();
		
		Product p1[] = new Product[n];//array of object
		
		
		
		
		
		for(int i=0; i<n; i++){
			
			System.out.print("Product Id : ");
			int id = xyz.nextInt();
			
			System.out.print("Product Name: ");
			String name = xyz.next();
			
			System.out.print("Product Price: ");
			double price = xyz.nextDouble();
			
			
			p1[i] = new Product(id,name,price);
			System.out.println("Original Product Details:");
			p1[i].displayProductDetails();
			
			
			
		
		}
		System.out.println("\nCopying the first product...");
        Product p2 = new Product(p1[0]);  // Using the copy constructor
        
        // Display the copied product details
        System.out.println("\nCopied Product Details:");
        p2.displayProductDetails();

	}
}
