//read and display employee details [id,name,gender,email,desigination,phone]
import java.util.Scanner;
class emps
{
	public static void main (String[] args)
	{
		Scanner scn=new Scanner (System.in);
		System.out.println(" Enter ID number = ");
		long id=scn.nextLong();
		System.out.println(" Enter Name = ");
		String name=scn.next();
		System.out.println(" Enter Gender [M/F] = ");
		char gender=scn.next().charAt(0);
		System.out.println(" Enter Email = ");
		String email=scn.next();
		System.out.println(" Enter Desigination = ");
		String des=scn.next();
		System.out.println(" Enter Phone number = ");
		long phone=scn.nextLong();
		System.out.println("---------------------");
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
		System.out.println(email);
		System.out.println(des);
		System.out.println(phone);
	}
}