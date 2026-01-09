//Write a Program to display calculator
import java.util.Scanner;
class demo18
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter num1");
		int num1=scn.nextInt();
		System.out.println("Enter num2");
		int num2=scn.nextInt();
		System.out.println("1.Add\n2.Sub\n3.Mul\n4.Div\n5.Mod");
		System.out.println("Enter your choice");
		int choice=scn.nextInt();
		switch(choice)
		{
			case 1: System.out.println("Result"+(num1+num2));
					break;
			case 2: System.out.println("Result"+(num1-num2));
					break;
			case 3: System.out.println("Result"+(num1*num2));
					break;
			case 4: System.out.println("Result"+(num1/num2));
					break;
			case 5: System.out.println("Result"+(num1%num2));
					break;
			default: System.out.println("Invalid Choice");
			
		}
	}
}	
