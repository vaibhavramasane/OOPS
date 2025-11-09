/*Q1. Find Maximum Element in Array
Class: ArrayMax
Functions:
void inputArray(int arr[]) → take array input
int findMax(int arr[]) → display maximum element
int findMin(int arr[]) → display minimum element
Logic: Loop through array, compare each element, store max. */

import java.util.Scanner;
class ArrayMax
{
	public static void main(String x[])
	{
		int[] m = new int[]{10,20,30,40,50};
		
		ArrayMax obj = new ArrayMax();
		obj.inputArray(m);
		int maxElement = obj.findMax();
		int minElement = obj.findMin();
		System.out.println("Max element is "+maxElement);
		System.out.println("Min element is "+minElement);
		
	}
}

class ArrayMax
{
	int a[];
	void inputArray(int arr[])
	{
		a = arr;
	}
	int findMax()
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
		}
		return max;
	}

	int findMin()
	{
		int min = Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min = a[i];
			}
		}	
		return min;
	}
}
