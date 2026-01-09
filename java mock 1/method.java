//WAM that accepts 2float value and return boolean value

class method
{
	public static void main(String[] args)
	{
		float a= 11.11f;
		float b= 22.22f;
		System.out.println("Hi main");
		System.out.println(display(a,b));
		System.out.println("bye main");
	}
	public static Boolean display(float a, float b)
	{
		System.out.println("Hi display");
		System.out.println(a);
		System.out.println(b);
		return true;
	}
}