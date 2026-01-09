//WAPD sum of odd number b/w range
import java.util.Scanner;
class task9
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the start");
		int start=scn.nextInt();
		System.out.println("Enter the end");
		int end=scn.nextInt();
		System.out.println("---Result---");
		int i=start;
		int sum=0;
		while(i<=end)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);
	}
}