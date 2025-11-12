import java.util.*;
class CubeDemo{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter Values: ");
		int no = xyz.nextInt();
		int res = getcube(no);
		System.out.println("Cube is " + res);
		
	}
	
	public static int getcube(int val){ // placeholder==parameter
	
		int result = val * val * val;
		return result;
		
	}
}

	