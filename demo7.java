//check if the user is eligible for voting or not
import java.util.Scanner;
class demo7
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter your age=");
	   int age=scn.nextInt();
	   if(age>=18)
		{
		   System.out.println("your elegible");
	   }
	   else
	   {
		 System.out.println("not eligible");  
	   }
   }
}   