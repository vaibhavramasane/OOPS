/*
2. Implement a Calculator
Create a class Calculator with methods add, subtract, multiply, and divide for two numbers. Call them from the main method and print results.
Explanation: Teaches basic arithmetic operations using methods.
*/

import java.util.*;

class Calculator{
	
	int add(int x,int y){
		return x+y;
		
	}
	
	int sub(int x, int y){
		return x-y;
	}
	
	int mul(int x,int y){
		
		return x*y;
	}
	
	double div(int x, int y){
		return x/y;
		
	}
	
	
	public static void main(String x[]){
	
	Calculator obj = new Calculator();
	int num1 = 20,num2=2;
	System.out.println("Addition: " + obj.add(num1, num2));
	System.out.println("Substraction: " + obj.sub(num1,num2));
	System.out.println("Multiplication: " + obj.mul(num1,num2));
	System.out.println("Division: " + obj.div(num1,num2));
	}
	
}

	
