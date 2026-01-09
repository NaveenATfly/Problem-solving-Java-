// WAP to print the largest number in array
/*
class array {
	public static void main (String[] args)
	{
		int[] numbers={9,11,60,20,55};
		int largest = numbers[0];
		for (int i=1; i<numbers.length; i++)
		{
			if (numbers[i]> largest)
			{
				largest=numbers[i];
			}
		}
		System.out.println(largest);
	}
}
*/

// WAP to print minimum value in array

/*
class array
{
	public static void main ()
	{
		int[] num={5,17,2,20,6};
		int smallest = num[0];
		for (int i= 1; i<num.length; i++)
		{
			if (num[i]<smallest)
			{
				smallest=num[i];
			}
		}
		System.out.println(smallest);
	}
}
*/	

class array
{
	public static int op(int[] a)
	{
		int largest= a[0];
		for (int i=1; i<a.length; i++)
		{
			if (a[i]>largest)
			{
				largest=a[i];
			}
		}
		return largest;
	}
	public static void main (String[] args)
	{
		int[] a={22,33,77,66,44};
		int result = op(a);
		System.out.println(result);
	}
}
	
/*
Reverse a string
find the duplicate element in the array
remove duplicate in the array
check if the string is palandrom 
smallest element in  the array
implement a stack or queue
check if number is prime
fibonacii series
calculate factorial of number
implement binary search algorithm 
explain hierarical inheritance

theory
what is list
what is dictionary
diffrense between package and moduls in java
diffrense between final & finally
Synchronised keyword in java
what is inheritance 
pillers of oops // explain all 
what are the activation functions
what is TCL & CNN

SQL
diffrent types of joints and exeplanation
what are acid properties in DBMS
query to retrive specific data using sub query
sql query on joins with three tables

Cloud computing 
what is cloud computing 
diffrense between iaas, paas, saas 
benifits of cloud computing
what is firewall
OSI models and its layers
types of networks

Opration System
multi threading 



*/	