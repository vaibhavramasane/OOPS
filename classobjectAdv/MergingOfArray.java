/*
Q29. Merge Two Arrays
Class: ArrayMerge
Functions:
void inputArray(int arr1[], int arr2[])
int[] mergeArrays()
Logic: Create new array of size arr1.length + arr2.length and copy both arrays into it.
*/

import java.util.*;

class MergingOfArray {
    public static void main(String x[]) {
       // int m1[] = new int[]{1, 2, 3, 4, 5};
       // int m2[] = new int[]{6, 7, 8, 9, 10};
	   
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size of first array: ");
		int n = xyz.nextInt();
		
		int m1[] = new int[n];
		System.out.println("Enter elements in first array: ");
		
		for(int i=0; i<m1.length; i++){
			
			m1[i] = xyz.nextInt();
			
		}
		System.out.println("Enter size of Second array: ");
		int n1 = xyz.nextInt();
		int m2[] = new int[n1];
		System.out.println("Enter elements in Second Array: ");
		
		for(int i=0; i<m2.length; i++){
			
			m2[i] = xyz.nextInt();
			
		}
		

        ArrayMerge obj = new ArrayMerge();
        obj.inputArray(m1, m2);
        int result[] = obj.mergeArrays();

        System.out.println("Merge Two Arrays is : " + Arrays.toString(result));
    }
}

class ArrayMerge {
    int a[];
    int b[];

    public void inputArray(int arr1[], int arr2[]) {
        a = arr1;
        b = arr2;
    }

    public int[] mergeArrays() {
        // Create new array of combined size
        int n[] = new int[a.length + b.length];

        // Copy first array
        for (int i = 0; i < a.length; i++) {
			
            n[i] = a[i];
			
        }

        // Copy second array
        for (int j = 0; j < b.length; j++) {
			
            n[a.length + j] = b[j];
			
        }

        return n;
    }
}


	

		
		
		
	
	
	
		
		