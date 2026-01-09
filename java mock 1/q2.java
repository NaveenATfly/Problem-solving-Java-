//fibonacii series for the given length
import java.util.Scanner;
class q2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int n1=0;
		int n2=1;
		int n3=n1+n2;
		display(num,n1,n2,n3);
		System.out.println("---Result----");
	}
	public static void display( int num, int n1, int n2, int n3)
	{
		for(int i=0; i<=num; i++)
		{
			System.out.println(n1);
			n1=n2;
			n2=n3;
			n3=n1+n2;
		}
	}
}
	
			