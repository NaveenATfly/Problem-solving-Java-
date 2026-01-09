//WAP TO DEVELOP CALCULATOR
import java.util.Scanner;
class task1
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the value1");
		int num1=scn.nextInt();
		System.out.println("Enter value2");
		int num2=scn.nextInt();
		System.out.println("Enter 1.add\n2.sub\n3.mul\n4.div\n5.mod");
		System.out.println("Enter your choice");
		int choice=scn.nextInt();
		System.out.println("---- Result---");
		switch(choice)
		{
			case 1:
			System.out.println("the addition on num is:"+(num1+num2));
			break;
			case 2:
			System.out.println("the Subraction on num is:"+(num1-num2));
			break;
			case 3:
			System.out.println("the Multiplication on num is:"+(num1*num2));
			break;
			case 4:
			System.out.println("the division on num is:"+(num1/num2));
			break;
			case 5:
			System.out.println("the modles on num is:"+(num1%num2));
			break;
			
		}
	}
}