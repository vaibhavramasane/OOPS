/*Q5.Count Even and Odd Numbers
Class: ArrayEvenOdd
Functions:
void inputArray(int arr[])
int countEven(int arr[])
int countOdd(int arr[])
*/
import java.util.*;
class FindCountEvenOddNum{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size:");
		int n  = xyz.nextInt();
		
		System.out.println("Enter ELement in array: ");
		int m[] = new int[n];
		
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
		ArrayEvenOdd obj = new ArrayEvenOdd();
		obj.inputArray(m);
		int EvenCount = obj.countEven();
		int OddCount  = obj.countOdd();
		
		System.out.println("Even Number: "+EvenCount);
		System.out.println("Odd Number: "+OddCount);
		
		
		
		
	}
}

class ArrayEvenOdd{
	int a[];
	public void inputArray(int arr[]){
		a = arr;
		
	}
	
	public int countEven(){
		int Ecount=0;
		for(int i=0; i<a.length; i++){
			
			if(i %2 ==0){
				
				Ecount++;
				
			}
		}
		return Ecount;
		
	}
	public int countOdd(){
		
		int OCount =0;
		for(int i=0; i<a.length; i++){
			
			if(i % 2==1){
				
				OCount++;
				
			}
		}
		return OCount;
		
	}
}

		
			
			
		