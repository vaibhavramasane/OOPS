/*

Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.

*/
import java.util.*;

class Q3Factorial{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = xyz.nextInt();
		int fact = FactDemo(n);
		System.out.println("Factorial number Is : " + fact);

	}
	public static int FactDemo(int k){
		
		int f=1;
		for(int i=1; i<=k; i++){
			
			f = f * i;
			
		}
		return f;
		
	}
}

		
	