/*
Q2. Calculate Sum of Array Elements
Class: ArraySum
Functions:
void inputArray(int arr[])
int calculateSum(int arr[])
Logic: Traverse array and add all values to sum.
*/

import java.util.Scanner;
class calSumOfArray
{
	public static void main(String x[])
	{
		//int[] m = new int[]{10,20,30,40,50};
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size:");
		int n = xyz.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		
		ArraySum obj = new ArraySum();
		obj.inputArray(m);
		int result = obj.calculateSum();
		System.out.println("Sum of Array Elements:" + result);
		
	}
}

class ArraySum{
	int a[];
	void inputArray(int arr[]){
		
		a= arr;
	}
	
	int calculateSum(){
		int sum =0;
		for(int i=0; i<a.length; i++){
				
			sum = sum + a[i];
				
		}
		return sum;
		
		
	}
	
}

		
		
		
		