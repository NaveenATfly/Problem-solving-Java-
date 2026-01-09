// PRINT SUM OF EVEN NUMBER BETWEEN 10 TO 20
class demo22
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i=11; i<=20; i=i+2)
		{
				System.out.println(i);
				sum=sum+i;
		}
		System.out.println(sum);
	}
}