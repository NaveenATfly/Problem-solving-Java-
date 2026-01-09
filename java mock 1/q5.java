//display main value from given array

import java.util.Scanner;
class q5
{
	public static void main (String[] args)
	{
		System.out.println("Enter the size");
		int size = scn.nextInt();
		
		int [] s1=new int[size];
		
		for (int i=0; i<=size-1; i++)
		{
			s1[i]=scn.nextInt();
		}	
		
        int s2 = s1[0];
		for (int i=1;i<s1.length; i++)
		{
			if(s1[i]>s2)
			{
				s2=s1[i];
			}
		}
		System.out.println(s2);
	}
}
