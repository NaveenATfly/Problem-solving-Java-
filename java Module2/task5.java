// fibonacci series for given length

import java.util.Scanner;
class task5
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Range");
		int num=scn.nextInt();
		logic1 l1=new logic1();
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		l1.print(num,n1,n2,n3);
	}
}

class logic1
{
	public void print(int num, int n1, int n2, int n3)
	{
		System.out.println("---Result----");
		for (int i=0; i<=num; i++)
		{
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}
		