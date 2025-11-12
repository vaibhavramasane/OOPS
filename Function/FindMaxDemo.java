/*

Example: WAP to create function name as int findMax(int a[]) this function accepts an
 array as a parameter and finds the max value from array and returns it.
*/

import java.util.*;

class FindMaxDemo{

	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter Number in Array");
		
		for(int i=0; i<arr.length; i++){
			
			arr[i] = xyz.nextInt();
			
		}
		int result = FindMax(arr); // arguments
		System.out.println("MaX Value is " + result);
	}
	public static int FindMax(int m[]){
		
		int max = m[0];
		for(int i=1; i<m.length; i++){
			
			if(m[i] > max){
				
				max = m[i];
				
			}
		}
		return max;
	}
}
		
	
		

	