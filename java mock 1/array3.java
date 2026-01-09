//Create String array for the user specified size,
//insert diffrent values and display all the values start with "si"
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=scn.nextInt();
		
		String[]s1=new String[size];
		System.out.println("Enter string");
		for(int i=0; i<=size-1; i++)
		{
			s1[i]=scn.next();
		}
		for(int i=0; i<=size-1; i++)
		{
			if(s1[i].startsWith("si"))
			{
				System.out.println("The values are ="+s1[i]);
			}
		}
	}
}
*/

//Create String array for the user specified size,
//insert diffrent values and display all the values ends with "a"
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=scn.nextInt();
		
		String[]s1=new String[size];
		System.out.println("Enter string");
		for(int i=0; i<=size-1; i++)
		{
			s1[i]=scn.next();
		}
		for(int i=0; i<=size-1; i++)
		{
			if(s1[i].endsWith("a"))
			{
				System.out.println("The values are = "+s1[i]);
			}
		}
	}
}
*/


//Create String array for the user specified size,
//insert diffrent values and display all the values that contains with "n"
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Size");
		int size=scn.nextInt();
		
		String[]s1=new String[size];
		System.out.println("Enter string");
		for(int i=0; i<=size-1; i++)
		{
			s1[i]=scn.next();
		}
		for(int i=0; i<=size-1; i++)
		{
			if(s1[i].contains("n"))
			{
				System.out.println("The values are = "+s1[i]);
			}
		}
	}
}

*/

//perfect number
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		print(num);
	}
	public static void print(int num)
	{
		int sum=0;
		for (int i=1; i<num; i++)
		{
			if (num%i==0)
			{
				sum=sum+i;
			}
		}
		if (num==sum)
		{
			System.out.println("The given number is perfect Number");
		}
		else 
		{
			System.out.println("The given number is not perfect Number");
		}
	}
}
*/

//given number is prime or not
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int count=0;
		print(num,count);
	}
	public static void print(int num, int count)
	{
		for (int i=1; i<num; i++)
		{
			if (num%i==0)
			{
				count++;
			}
		}
		if (count==2)
		{
			System.out.println("Its prime number");
		}
		else
		{
			System.out.println("Its not a prime number");
		}
	}
}
*/
//factorial of num
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int fact=1;
		print(num,fact);
	}
	public static void print(int num, int fact)
	{
		for (int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}
		
*/
//fibonacci series
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int a = 0;
		int b = 1;
		int c = a + b;
		print(num,a,b,c);
	}
	public static void print (int num,int a, int b, int c)
	{
		for (int i=0; i<=num; i++)
		{
			System.out.println(a);
			a=b;
			b=c;
			c=a+b;
		}
	}
}

*/	

// palandrom or not
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int num=scn.nextInt();
		int orgnum = num;
		int rev=0;
		int rem=0;
		display(orgnum,num,rev,rem);
	}
	public static void display(int num, int rem, int rev,int orgnum)
	{
		while(num>0)
		{
			rem= num%10;
			rev= rev * 10 + rem;
			num=num/10;
		}
		System.out.println(rev);
		if (orgnum==num)
		{
			System.out.println("its palandrom!!");
		}
		else 
		{
			System.out.println("Not palandrom");
		}
	}
}
*/		

//print char by char
/*
import java.util.Scanner;
class array3
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter String");
		String s1=scn.next();
		char ch='a';
		print(s1, ch);
	}
	public static void print (String s1, char ch)
	{
		for(int i=0; i<=s1.length()-1; i++)
		{
			ch=s1.charAt(i);
			System.out.println(ch);
		}
	}
}

*/
// char by char in reverse
/*
import java.util.Scanner;
class array3
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
		for (int i=s1.length()-1; i>=0; i--)
		{
			System.out.println(s1.charAt(i));
		}
	}
}
*/

//String palandrom
/*
import java.util.Scanner;
class array3
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
*/

//print all even odd sum of even and sum of odd

		
			
		
		