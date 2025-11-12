/*

Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.

*/

import java.util.*;

class Q4PrimeNum{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = xyz.nextInt();
		boolean primeN = isPrime(n);
		System.out.println(primeN);
		
	}
	public static boolean isPrime(int k){
		
		boolean flag = true;
		for(int i=2; i<=k; i++){
			
			if(k % i ==0){
				
				flag = false;
				break;
				
			}
			
		}
		if(flag){
			
			return true;
			
		}else{
			
			return false;
			
		}
	}
}
			
		
	
		
		
		
		
