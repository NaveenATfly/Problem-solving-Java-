// WAP to check the number is perfect number or not

import java.util.Scanner;
class task5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		System.out.println("---Result---");
		int sum=0;
		for(int i=1; i<=num; i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if(num==sum)
		{
			System.out.println("The given number is perfect number:"+sum);
		}
		else
		{
			System.out.println("The given number is not perfect number:"+sum);
		}
	}
}
		
