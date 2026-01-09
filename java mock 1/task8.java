// WAPD multiple of 3 between range

import java.util.Scanner;
class task8
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=scn.nextInt();
		System.out.println("Enter the end");
		int end=scn.nextInt();
		System.out.println("---Result---");
		int i=start;
		while(i<=end)
		{
			if(i%3==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}
}