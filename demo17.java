/*to read yoe from the user and perform the below the operation,
->if the yoe is greater than 5 then read salary from the user and do the following
if salary is greater than 5000 then increase the salary by 2000
else increase the salary by 1000
->else display "not eligible for increment
*/

import java.util.Scanner;
class demo17
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter yoe");
	   int yoe=scn.nextInt();
	   if(yoe>5)
	   {
		System.out.println("enter Salary");
		int salary=scn.nextInt();
		if(salary>5000)
		{
			salary=salary+2000;
			System.out.println("New Salary"+salary);
	    }
		else
		{
		 salary=salary+1000;
		 System.out.println("New Salary"+salary);
		}
	   }
		else
		{
			System.out.println("not eligible for increment");
		}
   }
}   
			