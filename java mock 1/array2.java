//Create a double array for the user specified size insert
// diffrent values and display all the values lesser then 14.1
/*
import java.util.Scanner;
class array2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scn.nextInt();
		
		double[] d1=new double[size];
		
		System.out.println("enter values");
		for(int i=0; i<size ; i++)
		{
			d1[i]=scn.nextDouble();
		}
		System.out.println("---Result---");
		for(int i=0; i<size ; i++)
		{
			if(d1[i]<14.1)
			{
				System.out.println(d1[i]);
			}
		}
	}
}

*/

/*Create a double array for the user specified size insert
diffrent values and display sum of all the values more then 13.1 */
/*
import java.util.Scanner;
class array2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scn.nextInt();
		
		double[] d1=new double[size];
		
		System.out.println("enter values");
		for(int i=0; i<size ; i++)
		{
			d1[i]=scn.nextDouble();
		}
		System.out.println("---Result---");
		double sum = 0.0;
		for(int i=0; i<size ; i++)
		{
			if(d1[i]>13.2)
			{
				sum=sum+d1[i];
			}
		}
		System.out.println(sum);
	}
}

*/


/*Create a char array for the user specified size insert
diffrent values and display all the lower case char */
/*
import java.util.Scanner;
class array2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scn.nextInt();
		
		char[] c1=new char[size];
		
		System.out.println("enter character:");
		for(int i=0; i<size ; i++)
		{
			c1[i]=scn.next().charAt(0);
		}
		System.out.println("---Result---");
		for(int i=0; i<size ; i++)
		{
			if(c1[i]>='a' && c1[i]<='z')
			{
				System.out.println(c1[i]);
			}
		}
		
	}
}

*/


/*Create a char array for the user specified size insert
diffrent values and display count of all the upper case char */
/*
import java.util.Scanner;
class array2
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=scn.nextInt();
		
		char[] c1=new char[size];
		
		System.out.println("enter character:");
		for(int i=0; i<size ; i++)
		{
			c1[i]=scn.next().charAt(0);
		}
		System.out.println("---Result---");
		int count=0;
		for(int i=0; i<size ; i++)
		{
			if(c1[i]>='A' && c1[i]<='Z')
			{
				count++;
			}
		}
		System.out.println(count);
		
	}
}
*/


/*Create a char array for the user specified size insert
diffrent values and display count of all the vowels */