package string1;
import java.util.*;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String to check palindrome:");
		String str=sc.nextLine();
		String str2="";
		for (int i=str.length()-1;i>=0;i--)
		{
			str2+=str.charAt(i);	
		}
		if (str.equals(str2))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palindrome");
		}
	}
}