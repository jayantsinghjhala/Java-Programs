package string1;
import java.util.*;
import java.lang.*;

public class underscore {
	public static void main(String[] args)
	{
		String str="fe_er";
		String str2="fever:feber:fiter:feler:fixer";
		str=str.toUpperCase();
		str2=str2.toUpperCase();
		String[] str3=str2.split("[:]+");
        String output1="";
		int n=str.indexOf("_");
        int l=str.length();
        for(int i=0;i<str3.length;i++)
        {
            if(str3[i].length()==l)
            {
                char c=str3[i].charAt(n);
                String strr=str.replace('_',c);
                
                if(strr.equals(str3[i]))
                {
                    output1=output1.concat(str3[i]+":");
                }
            }
        }
        System.out.println(output1.substring(0,output1.length()-1));
	}
}
