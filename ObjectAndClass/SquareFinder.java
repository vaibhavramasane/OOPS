/*
8. Find Square of a Number
Create a class SquareFinder with a method square that calculates the square of a number.
Explanation: Covers single-parameter logic in methods.
*/
import java.util.*;
class SquareFinder{
	
	public int square(int n){
		
		return n*n;
	}
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = xyz.nextInt();
		
		//int num = 4;
		SquareFinder obj = new SquareFinder();
		System.out.println("Square is " + obj.square(num));
		
	}
}

		
		