// given number is prime or not 

import java.util.Scanner;
class task3
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		logic1 l1=new logic1();
		l1.print(num);
	}
}

class logic1
{
	public void print(int num)
	{
		int count=0;
		for (int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		logic2 l2=new logic2();
		l2.display(count);
		
	}
}


class logic2
{
	public void display(int count)
	{
		if (count==2)
		{
			System.out.println("its Prime number!!");
		}
		else
		{
			System.out.println("its not a Prime number!!");
		}
	}
}
			
		
		
		