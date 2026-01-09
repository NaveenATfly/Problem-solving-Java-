/* WAP to read a number from the user and perform the operation 
	if the number is greater then or equal to 0 then do the following 
		if the number is even then print "Dinga Rocked"
		else display " Pinga Rocked"
	else print"singa rocked"
*/	
import java.util.Scanner;
class demo15
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter any number=");
	   int num=scn.nextInt();
	   if(num>=0)
	   {
		 num=num%2;
		 if(num==0)
		 {
			System.out.println("Dinga Rocked"); 
		 }
		 else
		 {
			System.out.println("Pinga Rocked"); 
		 }
	   }
	   else
	   {
		   System.out.println("Singa Rocked"); 
	   }
   }
}