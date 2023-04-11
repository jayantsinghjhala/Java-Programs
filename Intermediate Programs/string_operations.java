package string1;
import java.util.*;
import java.lang.*;
public class string1 
{
	 public static void main(String[] args)
	 {
         String str="abc";
         String str2="cba";
         String str3="abc";
         System.out.println("Comparision:"+str.compareTo(str3));
         System.out.println(str2.contains("a"));
         System.out.println(str);
         
         String s1="hello";
         String s="Hello";
         String s2="12344";
         char c[]=new char[10];
         s.getChars(1,3,c,0);
         for (char c1:c)
        	 System.out.print(c1);
         System.out.println();
         
         System.out.println(s.matches("[Ha-z]+"));
         System.out.println(s1.matches("^h...o$"));
         System.out.println(s2.matches("\\d{5}"));
         System.out.println(s1.replace("e", "E"));
         System.out.println(s1);
         System.out.println(s2.replaceAll("\\d{5}", "88888"));
         System.out.println(s2);
         
         
         String s3="Hello World I am     a Coder King";
         System.out.println(s3.split("[ ]+"));
         String strm[]=s3.split("[ ]+");
         System.out.println(strm);
         for (String a:strm)
         {
        	System.out.println(a);
        	for (char m:a)
         	if(m.isUpperCase(ch)) 
         	{
         		System.out.println(m+"letter is upper case");
         	}
         	else
         	{
         		System.out.println(m+"letter is not upper case");
         	}
         }
         		
     }
}
