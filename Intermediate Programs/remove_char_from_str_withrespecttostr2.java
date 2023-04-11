package string1;
import java.lang.*;
import java.util.*;
public class remove_char_from_str_withrespecttostr2 {
	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String str2=sc.nextLine();

		for(int i=0;i<str.length();i++)
		{
			//str2=str2.replaceFirst(str.charAt(i)+"","");
			if(str2.contains(str.charAt(i)+""))
			{
				int j=str2.indexOf(str.charAt(i));
				str2=str2.substring(0,j)+str2.substring(j+1);
				
			}
		}
		System.out.println(str2);
		
	}
}
