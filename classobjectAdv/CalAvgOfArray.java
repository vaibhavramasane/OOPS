/*
Q3. Calculate Average of Array Elements
Class: ArrayAverage
Functions:
void inputArray(int arr[])
double findAverage(int arr[])
*/
import java.util.*;
class CalAvgOfArray{
	
	public static void main(String x[]){
		
		//int m[] = new int[]{10,20,30,40,50};
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n= xyz.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter elements in an arry: ");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		
		ArrayAverage obj = new ArrayAverage();
		obj.inputArray(m);
		double result = obj.findAverage();
		System.out.println("Average of Array Elements: " + result);
	}
	
}

class ArrayAverage{
	int a[];
	public void inputArray(int arr[]){
		a= arr;
	}
	
	public double findAverage(){
		
		double sum=0;
		for(int i=0; i<a.length; i++){
			
			sum = sum + a[i];
			
		}
		return sum/a.length;
	}
	
}
		
		
		