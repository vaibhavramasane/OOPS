// Palindrome check using recursion

import java.util.*;

class palind {
    
    int rev = 0;
    int temp;   // to store original number
    
    void PLDF(int n) {
        if (n > 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            PLDF(n / 10);   // recursive call
        } else {
            // check only after recursion is complete
            if (rev == temp) {
                System.out.println("Palindrome");  
            } else {
                System.out.println("Not Palindrome"); // 
            }
        }
    }
}

class PalindromeFun {
    public static void main(String x[]) {
        
        int n = 123;
        
        palind obj = new palind();
        obj.temp = n;        // store original number
        obj.PLDF(n);
    }
}
