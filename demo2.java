import java.util.Scanner;
class demo2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter X & Y value");
		int x=scn.nextInt();
		int y=scn.nextInt();
		if (x>y)
		{
			System.out.println("x is Grater");
		}
		System.out.println("Program Completed");
	}
}