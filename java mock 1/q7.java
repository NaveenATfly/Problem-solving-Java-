//WAP to cheack if a given number is prime number or not

import java.util.Scanner;
class q7
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int count=0;
		display(num,count);
	}
	public static void display(int num, int count)
	{
		for(int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println(count);
		if (count==2)
		{
			System.out.println("its Prime number ");
		}
		else
		{
			System.out.println("not a Prime number ");
		}
	}
}