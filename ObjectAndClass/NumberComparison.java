/* 3. Compare Two Numbers
Create a class NumberComparison with a method compare that checks if two numbers are equal, greater, or less.
Explanation: Introduces conditional statements in a method.
*/
import java.util.*;
class NumberComparison{
	
	boolean compare(int a, int b){
		
		if(a==b){
			
			return true;
			
		}else{
			
			return false;
			
		}
		
	}
	
	public static void main(String args[]){
		
		Scanner xyz= new Scanner(System.in);
		System.out.println("First and second Number: ");
		int x = xyz.nextInt();
		int y = xyz.nextInt();
		
		NumberComparison obj = new NumberComparison();
		System.out.println(obj.compare(x,y));
		
	}
}

			
		














