//Display sum of ODD numbers in array

class j6
 {
    public static void main(String[] args) 
	{
        int[] arr = {10, 35, 20, 30, 45};
		
        int sum = 0;
        for (int num: arr) 
		{
            if (num%2!=0) 
			{ 
                sum += num;
            }
		}
	System.out.println(sum);
	}
}
