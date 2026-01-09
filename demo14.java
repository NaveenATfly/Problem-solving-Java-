/* Condition If Salary is Greater then 10000.0 then Increase the salary by 20%
	else if the salary is lesser then 10000.0 then decrese the salary by 30%
	else increse the salary by 90% 
*/
import java.util.Scanner;
class demo14
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter any num=");
	   double salary=scn.nextDouble();
	   if(salary>10000.0)
		{
		   salary=salary+salary*0.20;
		   System.out.println("Num="+salary);
	   }
	   else if (salary<10000.0)
	   {
		  salary=salary-salary*0.30;
		   System.out.println("Num="+salary); 
	   }
	   else
	   {
		   salary=salary+salary*salary*0.90;
		   System.out.println("Num="+salary);
	   }
   }
   
}
