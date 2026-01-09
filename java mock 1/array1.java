//
import java.util.Scanner;
class array1
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("enter the Size of array:");
		int size=scn.nextInt();
		//creating array
		int a1[]=new int[size];
		//insert values
		System.out.println("Enter the values:");
		for(int i=0; i<=size-1; i++)
		{
			a1[i]=scn.nextInt();
			
			if (a1[i]%2!=0)
			{
				System.out.println(a1[i]);
			}
		}
	}
}	
		