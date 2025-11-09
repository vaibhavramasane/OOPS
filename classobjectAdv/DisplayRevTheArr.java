/*Q6. Reverse the Array
Class: ArrayReverse
Functions:
void inputArray(int arr[])
void reverseArray(int arr[])
*/

import java.util.*;
class DisplayRevTheArr{
	
	public static void main(String x[]){
		
		//int m[] = new int[]{10,20,30,40,50};
		Scanner xyz  = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter element in an array :");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		
		ArrayReverse obj= new ArrayReverse();
		obj.inputArray(m);
		obj.reverseArray();
		
		
	}
}

class ArrayReverse{
	int a[];
	public void inputArray(int arr[]){
		
		a=arr;
		
	}
	System.out.println("Reverse Number: ");
	public void reverseArray(){
		int start=0;
		int end=0;
		for(int i=a.length-1; i>=0; i--){
			
			System.out.print(a[i] + " ");
			
		}
		
	}
}
	
			
			
		
		