
/*
Find Maximum of Two Numbers

Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.
*/

import java.util.*;

class Q1FindMax{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter first Number: ");
		int a = xyz.nextInt();
		System.out.println("Enter Second Number: ");
		int b = xyz.nextInt();
		int MaxNum = FindMax(a,b);
		System.out.println("Maximum Number = " + MaxNum);
		
		
	}
	public static int FindMax(int a ,int b){
		
		if(a<b){
			
			return b;
			
		}else{
			
			return a;
			
		}
	}
}

	