/* Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.
*/

import java.util.*;

class CalculatorQ10{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int n1 = xyz.nextInt();
		
		System.out.println("Enter Second Number: ");
		int n2 = xyz.nextInt();
		
		System.out.println("Addition: " + add(n1,n2));
		System.out.println("Substraction: " + sub(n1,n2));
		System.out.println("Multiplication: " + mul(n1,n2));
		System.out.println("Division: " + div(n1,n2));
	
	}
	
	static int add(int a ,int b){
		
		return a+b;
		
	}
	
	static int sub(int a ,int b){
		
		return a-b;
		
	}
	
	static int mul(int a ,int b){
		
		return a*b;
		
	}
	
	static int div(int a ,int b){
		
		return a/b;
		
	}

		
}

