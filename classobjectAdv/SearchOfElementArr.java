/*Q4. Search an Element in Array
Class: ArraySearch
Functions:
void inputArray(int arr[])
boolean searchElement(int arr[], int key)
Logic: Traverse array, check if key matches any element.
*/

import java.util.*;
class SearchOfElementArr{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Length:");
		int n = xyz.nextInt();
		System.out.println("Enter elements of array: ");
		int m[] = new int[n];
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		System.out.println("Search of element: ");
		int k= xyz.nextInt();
		
		
		
		ArraySearch obj = new ArraySearch();
		obj.inputArray(m,k);
		boolean result = obj.searchElement();
		System.out.println("Search an Element in Array is " + result);
		
		
		
	}
}

class ArraySearch{
	int a[];
	int k;
	
	public void inputArray(int arr[],int key){
		a= arr;
		k= key;
		
	}
	
	public boolean searchElement(){
		
		for(int i=0; i<a.length; i++){
			
			if(a[i] == k){
				
				return true;
				
			
				
				
			}
		}
		return false;
	}
}