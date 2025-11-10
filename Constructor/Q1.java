/*Q1. Problem:
 Create a class Employee with fields:
empId, empName, basicSalary, hra, da, and grossSalary.
Use a parameterized constructor to initialize empId, empName, and basicSalary.
 HRA = 10% of basic, DA = 15% of basic, and Gross = Basic + HRA + DA.
 Display all employee details and salary slip.
Hint: Use constructor to calculate the salary.
*/

import java.util.*;

class Q1{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number of employee: ");
		int n = xyz.nextInt();
		
		Employee obj[] = new Employee[n];
		
		for(int i=0; i<n; i++){
			
			System.out.print("Enter Employee ID : ");
			int empId = xyz.nextInt();
			
			System.out.print("Enter Employee Name: ");
			String empName = xyz.next();
			
			System.out.print("Enter Basic salary: ");
			double basicSalary = xyz.nextDouble();
			
			
			obj[i] = new Employee(empId,empName,basicSalary);
			
			obj[i].displaysalaryslip();
			
		}
	
	}
}
class Employee{
	
	private int empId;
	private String empName;
	private double basicSalary,hra,da,grossSalary;
	
	public Employee(int empId,String empName,double basicSalary){
		
		this.empId = empId;
		this.empName = empName;
		this.basicSalary = basicSalary;
		this.hra = 0.1 * basicSalary ;
		this.da = 0.15 * basicSalary;
		this.grossSalary = hra + da;
		
	}
	
	/*
	//setter method
	public void setEmpId(int empId){
		this.empId = empId;
		
	}
	public void setEmpName(String empName){
		this.empName = empName;
		
	}
	public void setBasicSalary(double basicSalary){
		this.basicSalary = basicSalary;
	}
	public void setHRA(double hra){
		this.hra = hra;
		
	}
	public void setDA(double da){
		this.da = da;
		
	}
	public void setGrossSalary(double grossSalary){
		this.grossSalary = grossSalary;
		
	}
	
	
	//getter method
	public int getEmpId(){
		
		return empId;
		
	}
	public String getEmpName(){
		
		return empName;
		
	}
	public double getBasicSalary(){
		
		return basicSalary;
		
	}
	public double getHRA(){
		
		return hra;
		
	}
	public double getDA(){
		
		return da;
		
	}
	public double getGrossSalary(){
		
		return grossSalary;
	}
	*/
	
	void displaysalaryslip(){
		/*
		System.out.print("\nEmployee ID : " + getEmpId());
		System.out.print("\nEmployee Name: " + getEmpName());
		System.out.print("\nBasic Salary: " + getBasicSalary());
		System.out.print("\nHRA(10%): " + getHRA());
		System.out.print("\nDA(15%): " + getDA());
		System.out.print("\nGrossSalary: " + getGrossSalary());
		*/
		
		System.out.print("\nEmployee ID : " + empId);
		System.out.print("\nEmployee Name: " + empName);
		System.out.print("\nBasic Salary: " + basicSalary);
		System.out.print("\nHRA(10%): " + hra);
		System.out.print("\nDA(15%): " + da);
		System.out.print("\nGrossSalary: " + grossSalary);
		
		
		
		
		
	}
	
		
}
