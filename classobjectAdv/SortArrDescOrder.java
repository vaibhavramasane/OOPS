/*
Q7. Sort Array in Ascending Order
Class: ArraySort
Functions:
void inputArray(int arr[])
void sortArray()
*/

import java.util.*;

class SortArrDescOrder {
    public static void main(String x[]) {
        //int m[] = new int[]{10, 40, 20, 5, 4};
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Size: ");
		int n = xyz.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter elements in an array: ");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}
		
        ArraySort obj = new ArraySort();
        obj.inputArray(m);
        obj.sortArray();
    }
}

class ArraySort {
    int a[];

    public void inputArray(int arr[]) {
		
        a = arr;
		
    }

    public void sortArray() {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i=0; i<a.length; i++){
			
			System.out.println(a[i]);
			
			
        }
    }
}
