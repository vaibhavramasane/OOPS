/*
4. Check Even or Odd
Create a class NumberChecker with a method isEven that checks if a number is even or odd.
Explanation: Focuses on using modulus operator in logic.
*/

class NumberChecker{
	
	boolean isEven(int n){
		
		return n%2==0;
		
	}
	
	public static void main(String x[]){
		
		NumberChecker obj = new NumberChecker();
		int num =5;
		
		if(obj.isEven(num)){
			System.out.println(num + " is even");
			
		}else{
			System.out.println(num + " is Odd ");
			
		}
		
	}
}
		
		
			
			