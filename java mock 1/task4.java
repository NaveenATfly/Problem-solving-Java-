// WAP to check the given number is prime or  not

import java.util.Scanner;
class task4
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		int count=0;
		System.out.println("---Result---");
		for(int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
			{
				System.out.println("The number is prime number");
			}
			else
			{
				System.out.println("The number is not a prime number");
			}
	}
}