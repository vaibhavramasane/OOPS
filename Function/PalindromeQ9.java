/*
Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.

*/

import java.util.*;
class PalindromeQ9{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = xyz.nextInt();
		
		int rev =0;
		
		
		System.out.println(isPalindrome(n,rev));
		
		
		
	}
	
	public static boolean isPalindrome(int n,int rev){
		
		
		int temp =n;
		while(n!=0){
			
			int rem = n % 10;
			n = n/10;
			rev = rev * 10 + rem;
			
			
			
		}
		if(temp == rev){
			
			return true;
			
		}
		return false;
		
		
	}
}
		
		
		
		
		
		

