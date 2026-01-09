//WAM tht accepts 1 int,1boolean,1string,1char value and return char value
class method9
{
	public static void main(String[] args)
	{
		int a=10;
		boolean b= true;
		String c= "hello";
		char d='R';
		System.out.println("Hi main");
		System.out.println(display(a,b,c,d));
		System.out.println("bye main");
	}
	public static char display(int a,boolean b,String c,char d)
	{
		System.out.println("Hi display");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		return 'R';
	}
}