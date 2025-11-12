/*

Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.

*/

import java.util.*;

class Q2EvenOdd{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Value : ");
		int  n = xyz.nextInt();
		boolean isEven = EvenOdd(n);
		System.out.println(isEven);
		
	}
	public static boolean EvenOdd(int i){
		
		if(i%2==0){
			
			return true;
			
		}else{
			
			return false;
			
		}
	}
}
