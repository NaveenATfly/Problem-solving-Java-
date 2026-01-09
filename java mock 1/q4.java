//Cheack if the given string is palandrom or not

import java.util.Scanner;
class q4
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=scn.next();
		print(s1);
	}
	public static void print (String s1)
	{
		String sum="";
		for (int i=0; i<=s1.length()-1;i++)
		{
			sum=sum+ s1.charAt(i);
		}
		System.out.println(sum);
		System.out.println(s1);
		if (s1.equals(sum))
		{
			System.out.println("Palandrom!!");
		}
		else
		{
			System.out.println("Not palandrom");
		}
	}
}
