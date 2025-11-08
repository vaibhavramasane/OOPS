/*
18. Check Leap Year
Create a class LeapYearChecker with a method isLeapYear to check if a year is a leap year.
Explanation: Implements logical conditions for leap year calculation.
*/

import java.util.*;

class LeapYearChecker{
	
	public boolean isLeapYear(int n){
		
		if(n%4==0 && n%100!=0 || n%400==0){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("ENter Year: ");
		int num = xyz.nextInt();
		
		LeapYearChecker obj = new LeapYearChecker();
		//System.out.println(obj.isLeapYear(num));
		
		if(obj.isLeapYear(num)){
			
			System.out.println(num + " is Leap Year");
			
		}else{
			
			System.out.println(num + " is not Leap Year");
			
		}
	}
}
