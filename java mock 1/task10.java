`//WAPD only even digits from a given number

import java.util.Scanner;
class task10
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		System.out.println("---Result---");
		int i=1;
		int rem=0;
		while(i<=num)
		{
			rem=num%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			num=num/10;
			i++;
		}
	}
}