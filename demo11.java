/* if the num is greater then 100 then increse the num by 50
	else if the num is lesser then 100 decrese by 50
	else increase by 100
*/
import java.util.Scanner;
class demo11
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter any num=");
	   int num=scn.nextInt();
	   if(num>100)
	   {
		   num=num+50;
		   System.out.println("Num="+num);
	   }
	   else if (num<100)
	   {
		  num=num-50;
		   System.out.println("Num="+num); 
	   }
	   else
	   {
		   num=num+100;
		   System.out.println("Num="+num);
	   }
   }
   
}