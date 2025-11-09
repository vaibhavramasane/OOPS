/*
Q8.Copy Array Elements into Another Array
Class: ArrayCopy
Functions:
void inputArray(int arr[])
int[] copyArray()
Logic: Loop through source array and store elements into new array.
*/

import java.util.*;

class ArrayCopytoAnother {
    public static void main(String x[]) {
        //int m[] = {1, 2, 3, 4, 5};
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter size: ");
		int n = xyz.nextInt();
		
		int m[] = new int[n];
		System.out.println("Enter elements in an array:");
		for(int i=0; i<m.length; i++){
			
			m[i] = xyz.nextInt();
			
		}

        ArrayCopy obj = new ArrayCopy();
		
        obj.inputArray(m);
        int result[] = obj.copyArray();
        System.out.println("Copied Array: " + Arrays.toString(result));
    }
}

class ArrayCopy {
    int a[];

    // Store input array into 'a'
    public void inputArray(int arr[]) {
		
        a = arr;
		
    }

    // Create a new array and copy elements
	
    public int[] copyArray() {
        int b[] = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            b[i] = a[i];  // Copy element
        }

        return b;
    }
}
