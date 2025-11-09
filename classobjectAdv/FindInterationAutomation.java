/*Q35.Find Intersection of Two Arrays
Class: ArrayIntersection
Functions:
void inputArrays(int arr1[], int arr2[])
void findIntersection()
Logic:
Compare elements of arr1 with arr2.
If common element found, print it (but avoid duplicates).
*/

import java.util.*;

class FindInterationAutomation{
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        
        System.out.println("Enter Size of first Array:");
        int n1 = xyz.nextInt();
        int m1[] = new int[n1];
        System.out.println("Enter Elements in first Array:");
        for (int i = 0; i < m1.length; i++) {
            m1[i] = xyz.nextInt();
        }

        System.out.println("Enter Size of Second Array:");
        int n2 = xyz.nextInt();
        int m2[] = new int[n2];
        System.out.println("Enter Elements in Second Array:");
        for (int i = 0; i < m2.length; i++) {
            m2[i] = xyz.nextInt();
        }

        ArrayIntersection obj = new ArrayIntersection();
        obj.inputArrays(m1, m2);
        obj.findIntersection();
    }
}

class ArrayIntersection {
    int a[], b[];

    public void inputArrays(int arr1[], int arr2[]) {
        a = arr1;
        b = arr2;
    }

    public void findIntersection() {
        System.out.println("Intersection of Two Arrays:");
        for (int i = 0; i < a.length; i++) {
            // Check if element already printed
            boolean alreadyPrinted = false;
            for (int k = 0; k < i; k++) {
                if (a[i] == a[k]) {
                    alreadyPrinted = true;
                    break;
                }
            }
            if (alreadyPrinted) continue;

            // Check if a[i] exists in b[]
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
