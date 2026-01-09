/* if the num is greater then 200 then increse the num by 60%
	else if the num is lesser then 100 decrese by 40%
	else increase by 50%
*/
import java.util.Scanner;
class demo12
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter any num=");
	   double num=scn.nextDouble();
	   if(num>200)
		{
		   num=num+num*0.60;
		   System.out.println("Num="+num);
	   }
	   else if (num<200)
	   {
		  num=num-num*0.40;
		   System.out.println("Num="+num); 
	   }
	   else
	   {
		   num=num+num*num*0.50;
		   System.out.println("Num="+num);
	   }
   }
   
}