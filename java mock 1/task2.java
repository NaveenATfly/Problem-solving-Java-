//WAPD fibonacii series for the given length

import java.util.Scanner;
class task2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the length");
		int len=scn.nextInt();
		System.out.println("---Result---");
		int n1=0, n2=1, n3=n1+n2;
		for(int i=1;i<=len; i++)
		{
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}
		