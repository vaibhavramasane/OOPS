/*5. Calculate Simple Interest
Create a class SimpleInterest with a method calculate that computes
 simple interest given principal, rate, and time.
Explanation: Demonstrates mathematical formula implementation.
*/
import java.util.*;
class SimpleInterest{
	
	int calculate(int p,int r, int t){
		
		return (p*r*t)/100;
		
	}
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter principal, rate, and time.");
		int pr = xyz.nextInt();
		int rate = xyz.nextInt();
		int time = xyz.nextInt();
		
		SimpleInterest obj = new SimpleInterest();
		System.out.println("Simple Interest is " + obj.calculate(pr,rate,time));
		
	}
}

	
	
