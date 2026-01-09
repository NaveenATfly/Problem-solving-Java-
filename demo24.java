//WAP to display factors of given number
/*
import java.util.Scanner;
class demo24
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=scn.nextInt();
		for (int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
			System.out.println("Factorial of num is ="+i);
			}
		}
	}
}
*/

//WAP to dispaly factorial count of given number
/*
import java.util.Scanner;
class demo24
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=scn.nextInt();
		int count=0;
		for (int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		System.out.println("Factorial Count ="+count);
	}
}
*/

//WAP to dispaly Sum of factorial 

import java.util.Scanner;
class demo24
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter any num");
		int num=scn.nextInt();
		int sum=0;
		for (int i=1; i<=num; i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Factorial="+sum);
	}
}


//WAP to display the wheather the given number is prime or not
//