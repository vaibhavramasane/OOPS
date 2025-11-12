// Fibonacci Series

import java.util.*;

class fibo {
    int sum;
    int n1 = 0;
    int n2 = 1;

    void Series(int n) {
        if (n > 0) {
            System.out.print(n1 + " ");  
            sum = n1 + n2;               // calculate next term
            n1 = n2;
            n2 = sum;
            --n;
            Series(n);                   // recursive call
        }
    }
}

class FiboSeries {
    public static void main(String x[]) {
        //int n = 5;   // number of terms
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter nth terms : ");
		int n = xyz.nextInt();
		
		// creating an object
        fibo f1 = new fibo();
        f1.Series(n);
    }
}
