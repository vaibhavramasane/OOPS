/*
11. Reverse a Number
Create a class NumberReverser with a method reverse that reverses a given integer number.
Explanation: Covers basic loops for number manipulation.
*/

import java.util.*;

class NumberReverser{
	int rev =0;
	public int reverse(int n){
			
		while(n!=0){
				
			int rem = n % 10; // 3
			rev = rev * 10 + rem;//30
			n=n/10;//12
			
		}
		return rev;
		
	}
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = xyz.nextInt();
		//int num = 123;
		NumberReverser obj = new NumberReverser();
		System.out.print("Reverse Number: " +  obj.reverse(num));
	}
}
		