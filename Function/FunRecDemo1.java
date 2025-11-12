//Example: WAP to input number from keyboard and its
//S prints table using function recursion 

import java.util.*;

class FunRecDemo1{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter number from keyboard");
		int n = xyz.nextInt();
		show(n,0); // initial call
		
	}
	
	public static void show(int x , int count){
		
		count++;
		if(count>10){
			
			System.out.println("End");
			
		}
		else{
			
			System.out.println(" " + count*x);
			show(x,count); // recursive call
		}
	}
}