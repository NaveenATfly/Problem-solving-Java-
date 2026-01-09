// WAP to display the vowels from a given string

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = sc.nextLine();

        System.out.print("Vowels in the string: ");

        for (int i = 0; i < s1.length(); i++)
			{
				
            char ch = s1.charAt(i);

            if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'||ch == 'E'||ch == 'O'||ch == 'U')
				{
                System.out.print(ch + " ");
            }
        }
    }
}
