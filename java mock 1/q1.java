//WAP to cheack if a given number is prime number or not

import java.util.Scanner;
class q1
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		print(num);
	}
	public static void print(int num)
	{
		int sum = 0;
		for (int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				sum++;
			}
		}
		if (sum==2)
		{
			System.out.println("The number is Prime!!");
		}
		else
		{
			System.out.println("The number is not Prime");
		}
	}
}
