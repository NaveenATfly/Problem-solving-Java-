/* WAP to read a Attendance from the Student and perform the operation 
	if the attendance is greater then 60 then read marks do the following 
		if the mark is greater then or equal to 70 then Increase the mark by 10%
		else decrease the mark by 20%
	else print " No grace Marks"
*/	
import java.util.Scanner;
class demo16
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter Attendance=");
	   int attendance=scn.nextInt();
	   if(attendance>60)
	   {
		   System.out.println("enter the Marks=");
		   double mark=scn.nextDouble();
		   if(mark>=70)
		   {
			   mark=mark+mark*.10;
			   System.out.println("The new Mark"+mark);
		   }
		   else
			   {
			   	mark=mark-mark*.20;
			   System.out.println("The new Mark"+mark);
			   }
	   }
	   else
	   {
		   System.out.println("No Grace Marks");
	   }
   }
}