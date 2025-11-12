//Example: WAP to input number and reverse and return reverse number from function using a recursion 

import java.util.*;
public class ReverseFunction
{  public static void main(String x[])
   {  Scanner xyz  = new Scanner(System.in);
      int no;
	  System.out.println("Enter number from keyboard");
	  no=xyz.nextInt();
	  int result  =getRev(no,0);
	  System.out.printf("reverse value is %d\n",result);
   }
   public static int getRev(int no,int r)
   {
       if(no!=0)
	   { int rem = no % 10;
	      no  = no /10;
		  r=r*10+rem;
		 return getRev(no,r);
	   }
	   else{
	    return r;
	   }
   }
}
