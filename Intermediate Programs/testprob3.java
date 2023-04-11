package string1;
import java.util.*;
import java.lang.*;
public class testprob3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		testprob3 obj=new testprob3();
		System.out.println(obj.firstHalf(str));
		
	}
String firstHalf(String str)
{
	if (str.length()%2!=0)
	{
		return "NULL";
	}
	else
	{
		return str.substring(0,str.length()/2);
	}
}
}
