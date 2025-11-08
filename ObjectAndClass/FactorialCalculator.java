/*
12. Find Factorial of a Number
Create a class FactorialCalculator with a method findFactorial to compute the factorial of a number.
Explanation: Focuses on iterative or recursive logic.
*/

import java.util.*;

class FactorialCalculator{
	
	int p=1;
	public int findFactorial(int n){
		
		for(int i=1; i<=n; i++){
			
			p = p * i;
			
		}
		return p;
	}
	
	public static void main(String x[]){
		
		int num = 5;
		
		FactorialCalculator obj = new FactorialCalculator();
		System.out.println("Factorial of a Number" + obj.findFactorial(num));
	}
}	
			