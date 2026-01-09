// PRINT SUM OF EVEN NUMBER BETWEEN 10 TO 20
class demo21
{
	public static void main(String[] args)
	{
		int sum = 0;
		for (int i=10; i<=20; i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				sum=sum+i;
			}
		}
		System.out.println(sum);
	}
}