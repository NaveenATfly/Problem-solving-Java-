//WAPD if the given number is palindrome or not

import java.util.Scanner;
class task6
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=scn.nextInt();
		int rev=0;
		int rem=0;
		int i=0;
		int ognum=num;
		System.out.println("---Result---");
		while(num>=i)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
			i++;
		}
		System.out.println(rev);
		if (ognum==num)
		{
			System.out.println("The given number is palindrome");
		}
		else
		{
			System.out.println("The given number is not a palindrome");
		}
	}
}