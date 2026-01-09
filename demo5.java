// to check the number postive or negative
import java.util.Scanner;
class demo5
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the any number=");
	   int number=scn.nextInt();
	   if(number>=0)
		{
		   System.out.println("the number  is Positive");
	   }
	   else
	   {
		 System.out.println("the number  is Negative");  
	   }
   }
}   