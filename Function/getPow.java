import java.util.*;

class getPow{
	
	public static void main(String x[]){
		
		Scanner xyz = new Scanner(System.in);
		int bs ,ind,res;
		System.out.println("Enter Base and Index");
		bs = xyz.nextInt();
		ind = xyz.nextInt();
		res = getPower(bs,ind); // calling with argument
		System.out.println("Power is " + res);
		
	}
	public static int getPower(int base , int index){ //placeholder==parameter
		int p=1;
		for(int i=1; i<=index; i++){
			
			p = p * base;
			
		}
		return p;
	}
}
	