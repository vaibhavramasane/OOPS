/*Q2. Problem:
 Create a class Student with fields rollNo, name, m1, m2, m3, and total.
 Use a parameterized constructor to assign values to roll number, name, and marks.
 Calculate total marks inside the constructor and display details using a function.
Hint: Constructor should perform addition logic.
*/

import java.util.*;

class Q2{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of student:");
		int n = xyz.nextInt();
		
		Student s1[] = new Student[n];
		
		for(int i=0; i<n; i++){
			
			System.out.println("\nenter details for student " + (i+1));
			System.out.print("Enter roll Number: ");
			int rollNo = xyz.nextInt();
			
			System.out.print("Enter name: ");
			String name = xyz.next();
			
			System.out.print("Enter first marks: ");
			int m1  = xyz.nextInt();
			
			System.out.print("Enter second marks: ");
			int m2 = xyz.nextInt();
			
			System.out.print("Enter third marks: ");
			int m3 = xyz.nextInt();
			
			
			s1[i] = new Student(rollNo,name,m1,m2,m3);
			
			
				
			s1[i].displaytotalmarks();
				
			
			
		}
		
	}
}
class Student{
	
	private int rollNo;
	private String name;
	private int m1,m2,m3;
	private double total;
	
	public Student(int rollNo,String name,int m1,int m2,int m3){
		
		this.rollNo = rollNo;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
		this.total = m1 + m2 + m3;
	
	}
	// setter methods
	public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }
	public void setM1(int m1){
		this.m1 = m1;
		
	}
	public void setM2(int m2){
		this.m2 = m2;
		
	}
	public void setM3(int m3){
		this.m3 = m3;
		
	}
	// getter methods
	public int getRollNo(){
		return rollNo;
	}
	public String getName(){
		return name;
	}
	public int getM1(){
		return m1;
	}
	public int getM2(){
		return m2;
		
	}
	public int getM3(){
		
		return m3;
		
	}
	
	void displaytotalmarks(){
		
		
		System.out.println("Total Marks:  " + total);
		
	}
}
		
		
