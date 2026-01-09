//to find area of rectangle (formula = Length*breath)
import java.util.Scanner;
class Rectangle
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" enter length of the rectangle = ");
		double length=scn.nextDouble();
		System .out. println(" enter Breath of the rectangle = ");
		double Breath=scn.nextDouble();
		double area=length*Breath;
		System.out.println(area);
	}
}