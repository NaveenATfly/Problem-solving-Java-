//WAP to print factorial  of given number

import java.util.Scanner;
class task3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		System.out.println("---Result---");
		for(int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				System.out.println("The factorial of num is:"+i);
			}
		}
	}
}
			
		
