//Area of Square ( formula = Side*side)
import java.util.Scanner;
class Square
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" enter Side of the square = ");
		double Side=scn.nextDouble();
		double area=Side*Side;
		System.out.println(area);
	}
}