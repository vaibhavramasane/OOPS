import java.util.*;

class LocalVariDemo{

	public static void main(String x[]){
	
		int t = 200; // local variable
		display(t);
		
	}
	public static void display(int t){
		
		int m =100; // local variable
		System.out.println("T is "+(t*m));
		show(m);
		
	}
	public static void show(int m){
		
		System.out.println("M is " + m);
		
	}
}
