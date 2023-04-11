package string1;

import java.util.*;
import java.lang.*;
public class check_if_string_has_num {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		String m="";
		String test="";
		for(int i=0;i<str.length();i++)
		{
			m=Character.toString(str.charAt(i));
			try 
			{
				int j=Integer.parseInt(m);
				if(!test.contains(j+""))
				{
					System.out.println(j*j);
				}
				test=test.concat(j+"");
			}
			catch(Exception e)
			{
				continue;
			}
		}
		
	}

}
