//Read and Display mobile details [storage,color,model,brand,camera,display type]
import java.util.Scanner;
class mobile
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" Enter Brand = ");
		String brand=scn.next();
		System.out.println(" Enter model = ");
		String model=scn.next();
		System.out.println(" Enter colour = ");
		String col=scn.next();
		System.out.println(" Enter Storage = ");
		double stg=scn.nextDouble();
		System.out.println(" Enter display Type = ");
		String dis=scn.next();
		System.out.println("---------------------");
		System.out.println(brand);
		System.out.println(model);
		System.out.println(col);
		System.out.println(stg);
		System.out.println(dis);
		System.out.println(phone);
	}
}