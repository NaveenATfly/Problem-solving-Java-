import java.util.Scanner;
class demo3
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter the value of x & y");
	   int x=scn.nextInt();
	   int y=scn.nextInt();
	   if(x<y)
	   {
		   System.out.println("y is greater");
	   }
	       System.out.println("program succesfully completed");
   }
}