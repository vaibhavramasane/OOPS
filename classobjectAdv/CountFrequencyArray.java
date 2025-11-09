/*
Q30. Count Frequency of Each Element
Class: ArrayFrequency
Functions:
void inputArray(int arr[])
void countFrequency()
Logic: For each element, count how many times it appears using nested loop.
*/
import java.util.*;

class CountFrequencyArray {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter size:");
        int n = xyz.nextInt();
        
        int m[] = new int[n];
        System.out.println("Enter elements in an array: ");
        
        for (int i = 0; i < m.length; i++) {
            m[i] = xyz.nextInt();
        }

        ArrayFrequency obj = new ArrayFrequency();
        obj.inputArray(m);
        obj.countFrequency();
    }
}

class ArrayFrequency {
    int a[];

    public void inputArray(int arr[]) {
        a = arr;
    }

    public void countFrequency() {
        boolean vist[] = new boolean[a.length];  // Initialize the visited array here
        
        for (int i = 0; i < a.length; i++) {
            if (vist[i]) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    vist[j] = true;
                    count++;
                }
            }
            System.out.println(a[i] + " occurs " + count + " times");
        }
    }
}
