/*Q34. Find Pair of Elements with Given Sum
Class: ArrayPairSum
Functions:
void inputArray(int arr[])
void findPairs(int target)
Logic: Check all pairs (i, j) where arr[i] + arr[j] == target
*/

import java.util.*;
class Findpairsofelement{
	
	public static void main(String x[]){
		Scanner xyz = new Scanner(System.in);
		System.out.println("ENter size: ");
		int n = xyz.nextInt();
		
		System.out.println("ENter element in array: ");
		int m[] = new int[n];
		
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		System.out.println("ENter target : ");
		int tar = xyz.nextInt();
		
		ArrayPairSum obj = new ArrayPairSum();
		obj.inputArray(m,tar);
		obj.findPairs();
		
		
		
	}
	
}

class ArrayPairSum{
	int a[];
	int t;
	public void inputArray(int arr[],int target){
		
		a = arr;
		t = target;
		
		
	}
	
	public void findPairs(){
		
		for(int i=0; i<a.length; i++){
			
			for(int j=i+1; j<a.length; j++){
				
				if(a[i] + a[j] == t){
					
					System.out.println(a[i] + " " + a[j] + " ");
					break;
					
				}
			}
		}
	}
}
				

			
			
		
		