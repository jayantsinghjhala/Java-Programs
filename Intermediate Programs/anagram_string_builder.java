package string1;

import java.util.*;
import java.lang.*;

public class anagram_string_builder {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str2=sc.next();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		StringBuilder sb=new StringBuilder(str);
		StringBuilder sb2=new StringBuilder(str2);
		for(int i=0;i<str.length();i++)
		{
			char c=sb.charAt(i);
			int n=sb2.indexOf(Character.toString(c));
			if(n==-1)
				break;
			sb2.deleteCharAt(n);			
		}
		System.out.println(sb2.length());
		if((sb2.length()) == 0)
		{
			System.out.println("Strings are Anagram");
		}
		else
		{
			System.out.println("Strings are not Anagram");
		}
		//StringBuilder sb2=new StringBuilder(str2);
		/*sb.append("xyz");
		System.out.println(sb);
		sb.insert(2, "JSJ");
		System.out.println(sb);
		sb.delete(0,1);
		System.out.println(sb);
		sb.setCharAt(0, 'D');
		System.out.println(sb);*/
		
		/*char a[]=str.toCharArray();
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
		}*/
	}
}
