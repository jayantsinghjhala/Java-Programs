package string1;
import java.util.*;
public class remove_estrict 
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)+"").equals("*"))
			{
				count++;
			}
		}
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			int n=str.indexOf("*");
			str=str.substring(0,n-1)+str.substring(n+2);
		}
		System.out.println(str);
	}
}
