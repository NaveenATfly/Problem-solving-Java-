//WAP to accept 1double, 1char, 1 int and return String value

class method1
{
	public static void main(String[] args)
	{
		double a=11.11;
		char b='f';
		int c=1234;
		System.out.println("Hi main");
		System.out.println(display(a,b,c));
		System.out.println("bye main");
	}
	public static String display(double a, char b, int c)
	{
		System.out.println("Hi display");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		return "HI dinga dingi";
	}
}