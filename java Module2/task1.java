//WAPTD all the odd numbers between range
/*
import java.util.Scanner;
class task1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Start");
		int start=scn.nextInt();
		System.out.println("Enter End");
		int end=scn.nextInt();
		System.out.println("---result---");
		task1logic.m1(start,end);
	}
}

class task1logic
{	
	public static void  m1(int start,int end)
	{
		for(int i=start; i<=end; i++)
		{
			if(i%2!=0)
				{
					System.out.println(i);
				}
		}
	}
}
*/

//WAPTD mutiplication of 3 between given range in reverse order

import java.util.Scanner;
class task1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Start");
		int start=scn.nextInt();
		System.out.println("Enter End");
		int end=scn.nextInt();
		
		task1logic.m1(start,end);
		task2logic.sum(start,end);
		task3logic.mul(start,end);
	}
}

//multiplication of 3 in reverse order

class task1logic
{	
	public static void  m1(int start,int end)
	{
		System.out.println("---result---");
		for(int i=end; i>=start; i--)
		{
			if(i%3==0)
				{
					System.out.println("Multiplication of 3 ="+i);
				}
		}
	}
}

// Sum of all even numbers between range

class task2logic
{
	public static void sum(int start, int end)
	{
		System.out.println("---result---");
		int sum=0;
		for(int i=start; i<=end; i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of numbers:"+sum);
	}
}

// odd number in range


class task3logic
{	
	public static void  mul(int start,int end)
	{
		System.out.println("---result---");
		for(int i=start; i<=end; i++)
		{
			if(i%2!=0)
				{
					System.out.println(" ODD numbers="+i);
				}
		}
	}
}