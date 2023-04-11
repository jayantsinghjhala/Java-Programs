package string1;
import java.util.*;
import java.lang.*;
public class testprob4 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		/*testprob4 obj= new testprob4();
		System.out.println(obj.multioccur(str));*/
		String str2="";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++)
		{
			if(str2.contains(Character.toString(str.charAt(i))))
				continue;
			else
				str2+=str.charAt(i);
		}
		System.out.println(str2);
	}
}
/*String multioccur(String str)
{
	String str2="";
	for(int i=0;i<str.length();i++)
	{
		if (str2.contains(charAt(i)))
		{
			str2=str2.concat(charAt(i));
		}
	}
	
}*/


