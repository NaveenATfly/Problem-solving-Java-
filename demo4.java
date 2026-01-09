
//wap to check if the number is odd or even
import java.util.Scanner;
class demo4
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the any number=");
	   int number=scn.nextInt();
	   if (number%2==0)
	   {
		   System.out.println("the number  is even");
	   }
	   else
	   {
		 System.out.println("the number  is odd");  
	   }
   }
}   