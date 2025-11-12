/*Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.
*/

import java.util.*;
class ReverseQ6{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int n = xyz.nextInt();
		
		int rev = 0;
		int res = reverseNumber(n,rev);
		System.out.println("Reverse: " + res);
		
		
	}
	
	public static int reverseNumber(int n,int rev) {
		
		int temp = n;
		while(n!=0){
			
			int rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
			
		}
		return rev;
	}
}

		
			