//find th gratest of 2 numbers
import java.util.Scanner;
class demo6
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the X value=");
	   int x=scn.nextInt();
	   System.out.println("enter the y value=");
	   int y=scn.nextInt();
	   if(x>y)
		{
		   System.out.println("the x is greater="+x);
	   }
	   else
	   {
		 System.out.println("the y is greater="+y);  
	   }
   }
}   