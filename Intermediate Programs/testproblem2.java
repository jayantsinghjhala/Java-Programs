package string1;
import java.util.*;
import java.lang.*;
public class testproblem2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=str.substring(0,2);
		String str3="";
		for (int i=0;i<str.length();i++)
		{
			str3=str3.concat(str2);
		}
		System.out.println(str3);
	}
}
