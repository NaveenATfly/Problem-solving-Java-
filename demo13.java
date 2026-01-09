/* if input is equal to 'A' then display "Apple"
	else if input is equal to 'B' then display "Ball"
	else if input is equal to 'C' then display "Cat"
	else if input is equal to 'D' then display "Dog"
	else if input is equal to 'E' then display "Elephant"
	else invalid input	
*/
import java.util.Scanner;
class demo13
{
   public static void main (String[] args)
   {
	   Scanner scn=new Scanner(System.in);
	   System.out.println("enter any cha=");
	   char cha=scn.next().charAt(0);
	   if(cha=='A')
		{
		   System.out.println("Apple");
	   }
	   else if (cha=='B')
	   {
		   System.out.println("Ball"); 
	   }
	   else if (cha=='C')
	   {
		   System.out.println("Cat"); 
	   }
	   else if (cha=='D')
	   {
		   System.out.println("Dog"); 
	   }
	   else
	   {
		   System.out.println("Invalid Input");
	   }
   }
   
}