/*6. Find the Maximum of Three Numbers
Create a class MaxFinder with a method findMax that
returns the largest of three numbers.
Explanation: Enhances problem-solving using conditional statements.
*/
import java.util.*;
class MaxFinder{
	
	int findMax(int a,int b,int c){
		
		if(a>b && a>c){
			
			return a;
			
		}else if(b>a && b>c){
			
			return b;
			
		}else{
			
			return c;
			
		}
		
	}
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter three numbers: ");
		int p,q,r;
		p = xyz.nextInt();
		q = xyz.nextInt();
		r = xyz.nextInt();
		
		
		MaxFinder obj = new MaxFinder();
		System.out.println("Maximum of Three Numbers is " + obj.findMax(p,q,r));
		
	}
}

	
	