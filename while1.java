//WAP to print "sigma return!!!" 10 times
/*
class while1
{
public static void main(String[] args)
{
	int i=0;
	while (i<=10)
	{
		System.out.println("sigam Returns!!");
		i++;
	}
}
}
*/

//WAP to print all the number between 31 to 95
/*
class while1
{
public static void main(String[] args)
{
	int i=31;
	while (i<=95)
	{
		System.out.println(i);
		i++;
	}
}
}
*/

//WAP to print all the number between 22 to 44 in reverse order
/*
class while1
{
public static void main(String[] args)
{
	int i=44;
	while (i>=22)
	{
		System.out.println(i);
		i--;
	}
}
}
*/

//WAP to print all the even number between 521 to 751 in reverse order
/*
class while1
{
public static void main(String[] args)
 {
	int i=751;
	while (i>=521)
	{
	if(i%2==0)
		{
		System.out.println(i);
		}
	i--;
	}
 }
}
*/

//WAP to print all the ODD number between 212 to 415
/*
class while1
{
public static void main(String[] args)
 {
	int i=212;
	while (i<=415)
	{
	if(i%2!=0)
		{
		System.out.println(i);
		}
	i++;
	}
 }
}
*/

//WAP to print all the multiple of 15 between 101 to 301
/*
class while1
{
public static void main(String[] args)
 {
	int i=101;
	while (i<=301)
	{
	if(i%15==0)
		{
		System.out.println(i);
		}
	i++;
	}
 }
}
*/

//WAP to print sum of number between 55 to 99
/*
class while1
{
public static void main(String[] args)
 {
	int i=55;
	int sum =0;
	while (i<=99)
	{
		sum=sum+i;
		i++;
	}
	System.out.println(sum);
 }
}
*/

//WAP to print sum of all even number between 43 to 71
/*
class while1
{
public static void main(String[] args)
 {
	int i=43;
	int sum =0;
	while (i<=71)
	{
		if(i%2==0)
		{
		sum=sum+i;
		}
		i++;
	}
	System.out.println(sum);
 }
}
*/

//WAP to print sum of all Odd number between 151 to 251
/*
class while1
{
public static void main(String[] args)
 {
	int i=151;
	int sum =0;
	while (i<=251)
	{
		if(i%2!=0)
		{
		sum=sum+i;
		}
		i++;
	}
	System.out.println(sum);
 }
}
*/

//WAP to print sum of multipleof 12 between 1 to 105
/*
class while1
{
public static void main(String[] args)
 {
	int i=1;
	int sum =0;
	while (i<=105)
	{
		if(i%12==0)
		{
		sum=sum+i;
		}
		i++;
	}
	System.out.println(sum);
 }
}
*/

// WAPD to count the even number between 101 to 201
/*
class while1
{
public static void main(String[] args)
 {
	int i=101;
	int count =0;
	while (i<=201)
	{
		if(i%2==0)
		{
		count++;
		}
		i++;
	}
	System.out.println(count);
 }
}
*/

// WAPD to count the Odd number between 549 to 899
/*
class while1
{
public static void main(String[] args)
 {
	int i=549;
	int count =0;
	while (i<=899)
	{
		if(i%2!=0)
		{
		count++;
		}
		i++;
	}
	System.out.println(count);
 }
}
*/

// WAPD to count the of multiple of 9 between 101 to 701
/*
class while1
{
public static void main(String[] args)
 {
	int i=101;
	int count =0;
	while (i<=701)
	{
		if(i%9==0)
		{
		count++;
		}
		i++;
	}
	System.out.println(count);
 }
}
*/

//multipliction table of 10
/*
class while1
{
public static void main(String[] args)
 {
	int i=1;
	while(i<=10)
	{
		System.out.println("10 * "+i+" = "+(10*i));
		i++;
	}
 }
}

*/
/*
class while1
{
	public static int naveen (int i)
	{
	int sum=0;
	while (i<=10)
	{
		System.out.println("12 * "+i+" = "+(12*i));
		sum=sum+i;
		i++;
	}
	System.out.println("----result---");
	return sum;
	}
	public static void main(String[] args)
	{
		System.out.println(naveen(1));
	}
}
*/

// WA Program to count digits in a number using while.
/*
import java.util.Scanner;
class while1
{
	public static long digits (int num)
	{
		int count=0;
		  if (num==0)
		  {
			  count=1;
		  }
		  else
		  {
			while(num>0)
				{
				   num =num/10;
				   count++;
				}
		  }	
		  return count;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int num=scn.nextInt();
		System.out.println(digits (num));
	}
}
*/

//palandrom or not
import java.util.Scanner;
class while1
{
	public static long digits (int num)
	{
		int ognum = num;
		int reverse=0;
		while(num!=0){
			int digits=num%10;
			reverse = reverse *10+digits;
			num/=10;
		}
		if (reverse == ognum)
		{
			System.out.println("The number is palandrom");
		}
		else {
			System.out.println("The number is not palandrom");
		}
		return reverse;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("enter num");
		int num=scn.nextInt();
		System.out.println("Reversed:"+digits(num));
	}
}
		
	