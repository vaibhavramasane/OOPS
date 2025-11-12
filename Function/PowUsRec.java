/*
Example: WAP to input two values consider first as base and second index and calculate its power using recursion 
*/

import java.util.*;

class PowUsRec{
	
	public static void main(String x[])
	{
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Base and Index value");
		int base = xyz.nextInt();
		int index = xyz.nextInt();
		
		calPower(base,index,1);
		
		
	}
	public static void calPower(int b,int ind, int p)
	{
		if(ind!=0){
			
			p = p * b;
			calPower(b,--ind,p);
			
		}else{
			
			System.out.println("Power is " + p);

		}
		
			
			
	}
	
}