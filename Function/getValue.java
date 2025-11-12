/*
Example: WAP to create function name getValue(int x) this function accept single
value and calculate its square , cube and return from function 
*/

import java.util.*;

class getValue{
	
	public static void main(String x[]){
		
		int n = 5;
		int r[] = getValue(n);
		
		System.out.println("Result is " +r[0] + "\t" + r[1]);
		
	}
	
	public static int[] getValue(int val){
		
		int a[] = new int[2];
		int sq = val * val;
		int cb = val * val* val;
		a[0] = sq;
		a[1] = cb;
		return a;
		
	}
}