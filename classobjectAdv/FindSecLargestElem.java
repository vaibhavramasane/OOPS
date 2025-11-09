/*Q31. Find Second Largest Element
Class: ArraySecondLargest
Functions:
void inputArray(int arr[])
int findSecondLargest()
Logic: First find max, then find element just smaller than max.
*/

import java.util.*;

class FindSecLargestElem{
	
	public static void main(String x[]){
		
		//int m[] = new int[]{10,20,30,50,60};
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int m[]=new int[n];
		System.out.println("Enter elements in array: ");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		ArraySecondLargest obj = new ArraySecondLargest();
		obj.inputArray(m);
		int result = obj.findSecondLargest();
		System.out.println("Second Largest Element is : " + result);
		
	}
}

class ArraySecondLargest{
	int a[];
	public void inputArray(int arr[]){
		
		a = arr;
		
	}
	
	public int findSecondLargest(){
		
		int max = Integer.MIN_VALUE;
		int smax = Integer.MIN_VALUE;
		
		for(int i=0; i<a.length; i++){
			
			if (a[i] > max) {
                smax = max;
                max = a[i];
				
            }else if (a[i] > smax && a[i] < max) {
				
                smax = a[i];
				
			}
		}
		return smax;
	
		
	}
	
}
	
		
		