//funvtionDemo

import java.util.*;

class FunctionDemo{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = xyz.nextInt();
		int res = EvenN(n);
		
		System.out.println("EVEN NUMBER " + res);
		
	}
	public static int EvenN(int n){
		
		if(n % 2 ==0 ){
			
			
			
		}
		return EvenN(n);
	}
	
}
