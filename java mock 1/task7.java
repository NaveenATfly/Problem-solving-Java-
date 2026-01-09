// WAP to find gratest of 2 numbers

import java.util.Scanner;
class task7
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the num1");
		int n1=scn.nextInt();
		System.out.println("Enter the num2");
		int n2=scn.nextInt();
		System.out.println("---Result---");
		if(n1>n2)
			{
				System.out.println("number 1 is grater"+n1);
			}
		else if(n2>n1)
			{
				System.out.println("number 2 is grater"+n2);
			}
		else
			{
				System.out.println("Equal number");
			}
	}
}	