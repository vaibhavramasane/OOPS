/*
Q12. Check Array is Palindrome or Not
Class: ArrayPalindrome
Functions:
void inputArray(int arr[])
boolean isPalindrome()
Logic: Compare arr[i] with arr[n-i-1].
*/

class ArrayPalindromeApp {
    public static void main(String x[]) {
        // Example array
        int m[] = new int[]{1, 2, 3, 2, 1};
        
        ArrayPalindrome obj = new ArrayPalindrome();
        obj.inputArray(m);
        
        // Checking if the array is a palindrome and printing the result
        System.out.println(obj.isPalindrome());
    }
}

class ArrayPalindrome {
    int a[];

    public void inputArray(int arr[]) {
        a = arr;  // Storing the input array in the class variable
    }

    public boolean isPalindrome() {
        int start = 0, end = a.length - 1;
        
        // Compare elements from the start and end
        while (start < end) {
            if (a[start] != a[end]) {
                return false;  // If a mismatch is found, it's not a palindrome
            }
            start++;
            end--;
        }
        
        return true;  // If all pairs match, the array is a palindrome
    }
}
