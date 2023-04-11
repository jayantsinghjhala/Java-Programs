package string1;
import java.util.*;
public class test_problem {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();
		str=str.toLowerCase();
		str2=str2.toLowerCase();
		if (str.charAt(str.length()-1)==str2.charAt(0))
		{
			System.out.println(str.concat(str2.substring(1,str2.length())));
		}
		else {
			System.out.println(str.concat(str2));
		}
		
	}
}
