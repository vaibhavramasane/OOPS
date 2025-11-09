/*

7. Problem:
 Create a class Student with fields: rollNo, name, marks1, marks2, marks3.
 Write methods to calculate total marks and average, and display the grade:
If avg ≥ 75: Grade A

If avg ≥ 60: Grade B

Else: Grade C

Objective: Implement condition checks and use method-based logic.

*/
import java.util.*;
class StudentReportCard{
	public static void main(String x[]){
		
		student s = new student();
		s.setrollNo(101);
		s.setname("DeepaK");
		s.setmarks1(90);
		s.setmarks2(60);
		s.setmarks3(55);
		
		
		StudInfo I = new StudInfo();
		I.displayResult(s);
		
		
		
		
		
	}
}

class student{
	
	private int rollNo;
	private String name;
	private int marks1,marks2,marks3;
	
	public void setrollNo(int rollNo){
		
		this.rollNo = rollNo;
		
	}
	public int getrollNo(){
		
		return rollNo;
		
	}
	
	public void setname(String name){
		
		this.name = name;
		
	}
	public String getname(){
		
		return name;
		
	}
	
	public void setmarks1(int marks1){
		
		this.marks1 = marks1;
		
	}
	
	public int getmarks1(){
		
		return marks1;
		
	}
	
	
	public void setmarks2(int marks2){
		
		this.marks2 = marks2;
		
	}
	
	public int getmarks2(){
		
		return marks2;
		
	}
	
	public void setmarks3(int marks3){
		
		this.marks3 = marks3;
		
	}
	
	public int getmarks3(){
		
		return marks3;
		
	}
	
}
class StudInfo{
	
	public void displayResult(student s){
		
		int total = s.getmarks1() + s.getmarks2() + s.getmarks3();
		double avg = total / 3.0;
		
		System.out.println("Roll No : " + s.getrollNo());
		System.out.println("Name  : " + s.getname());
		System.out.println("Total : " + total);
		System.out.println("Average : " + avg);
		
		String str = avg>=75?"Grade-A":avg>=60?"Grade-B":"Grade-C";
		
		System.out.println(str);
		
	}
}

	
	
	
	
	
	
	
	