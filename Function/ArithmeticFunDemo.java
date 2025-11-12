// addition ,multiplication ,division,subtraction

import java.util.*;

class AFD{
	void Add(int a,int b){
		
		int result = a + b;
		System.out.println(result);
		
		
	}
	
	
}

class SFD{
	
	void sub(int c,int d){
		
		int res= c-d;
		System.out.println(res);
		
		
	}
}
		
class ArithmeticFunDemo{
	
	public static void main(String x[]){
		
		int n1 = 5;
		int n2 = 10;
		
		AFD f1 = new AFD();
		f1.Add(n1,n2);
		
		SFD f2 = new SFD();
		f2.sub(n1,n2);
		
		
		
	}
}
		
		