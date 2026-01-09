//wap to print all the odd numbers between the given range
/*
import java.util.Scanner;
class ass1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the num1");
		int n1=scn.nextInt();
		System.out.println("Enter the num2");
		int n2=scn.nextInt();
		print(n1,n2);
	}
	public static int print(int n1,int n2)
	{
		for(int i=n1;i<=n2;i++)
		{
			if(i%2!=0)
			{
				System.out.println(i);
			}
		}
	}
}
*/
//WAP multiple of 5 b/w range

/*
import java.util.Scanner;
class ass1
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" Enter Start");
		int start=scn.nextInt();
		System.out.println(" Enter End");
		int end=scn.nextInt();
		System.out.println("----Result---");
		display(start, end);
	}
	public static void display (int a, int b)
	{
		for (int i=a; i<=b ; i++)
		{
			if (i%5==0)
			{
				System.out.println(i);
			}
		}
	}
}
*/

//WAP to count of all even numbers in range

import java.util.Scanner;
class ass1
{
	public static void main (String [] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" Enter Start");
		int start=scn.nextInt();
		System.out.println(" Enter End");
		int end=scn.nextInt();
		System.out.println("----Result---");
		display(start, end);
		System.out.println("----Result---");
		System.out.println("Enter number1");
		int num=scn.nextInt();
		prime(num);
		perfect(num);
		System.out.println("----Result---");
		System.out.println("Enter number2");
		int num1=scn.nextInt();
		palandrom(num1);
		System.out.println("----Result---");
		System.out.println("Enter Height");
		double H=scn.nextInt();
		System.out.println("Enter Base");
		double B=scn.nextInt();
		triangle(H,B);
		System.out.println("----Result---");
		System.out.println("Enter Sides of Square =");
		int s1=scn.nextInt();
		Square(s1,s1);
	}
	public static void display(int a, int b)
	{
		int count=0;
		for (int i=a; i<=b ; i++)
		{
			if (i%2==0)
			{
				count++;
			}
		}
		System.out.println("Even numbers are ="+count);
	}
	public static void prime (int num)
	{
		int count=0;
		for (int x=1; x<=num; x++)
		{
			if (num%x==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("prime number");
		}
		else 
		{
			System.out.println(" not prime number");
		}
	}
	public static void perfect (int num)
	{
		int sum=0;
		for (int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (sum==num)
		{
			System.out.println("its Perfect number ="+sum);
		}
		else 
		{
			System.out.println(" not a perfect number =" +sum);
		}
	}
	public static void palandrom (int a)
	{
		int ognum= a;
		int rem=0;
		int rev=0;
		while(a>0)
		{
			rem=a%10;
			rev=rev*10+rem;
			a=a/10;
		}
		System.out.println("The Orginal number is ="+ognum);
		if (ognum==rev)
		{
			System.out.println("The number is Palandrom ="+rev);
		}
		else
		{
			System.out.println("The number is not a Palandrom ="+rev);
		}
	}
	public static void triangle(double base, double height)
	{
		double area= 0.5*base*height;
		System.out.println("The area of triangle is ="+area);
	}
	public static void Square(int S1, int S2)
	{
		int area= S1*S2;
		System.out.println("The area of Square is ="+area);
	}
}
