//WAPTF the area of rectangle(Formula= Length*breath)

import java.util.Scanner;

/*class task2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the length of rectangle=");
		double length=scn.nextDouble();
		System.out.println("Enter the breath of rectangle=");
		double breath=scn.nextDouble();
		task2logic t2l=new task2logic();//Object Creation Statement
		t2l.print(length,breath);
	}
}
*/

class task2logic
{
	public void print(double length, double breath)
	{
		double area= length*breath;
		System.out.println("The area of Rectangle is ="+area);
	}
}

// area of Square

class task2
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println("Enter the Side1 of Square=");
		int side1=scn.nextInt();
		System.out.println("Enter the Side2 of Square=");
		int side2=scn.nextInt();
		task2logic1 t2l1=new task2logic1();
		t2l1.square(side1,side2);
	}
}
		

class task2logic1
{
	public void square(int side1,int side2)
	{
		int area= side1*side2;
		System.out.println("Area of Square is="+area);
	}
}

// given number is prime or not 
// fibonacci series for given length