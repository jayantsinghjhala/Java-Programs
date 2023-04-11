package string1;
import java.util.*;
import java.lang.*;

public class anagram {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.next();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		char a[]=str.toCharArray();
		char b[]=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a);
		System.out.println(b);
		System.out.println(a.equals(b));
		if(a.equals(b))
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("STrings are not Anagram");
		}
	}
}
