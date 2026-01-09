// WAPD amstrong number
class amstrong
{
	public static int demo(int num)
	{
		int orginalnum = num;
		int reverse = 0;
		while(num!=0)
		{
			int digit = num % 10;
			reverse = reverse * 10 + digit;
			num/=10;
		}
		
		if ( reverse == orginalnum)
		{
			System.out.println("The number is palindrom number"+reverse);
		}
		else
		{
			System.out.println("The number is not palindrom number");
		}
		return reverse;
	}
	
	public static void main (String[] args)
	{
		System.out.println (demo(121));
	}
}
