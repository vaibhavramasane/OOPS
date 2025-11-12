//sum of Natural Number

import java.util.*;

class SumDemo{
	int sum=0;
	void SumNat(int n){
		
		if(n>=1){
			
			
			sum = sum + n;
			--n;
			SumNat(n);
			
		}
		else{
		System.out.println("Sum of Natural Number =" +sum);
		}
		
		
	}
	
}
	

class SumOFNaturalFun{
	
	public static void main(String x[]){
		
		int n = 5;
		
		SumDemo obj = new SumDemo();
		obj.SumNat(n);
		
	}
}

		
		