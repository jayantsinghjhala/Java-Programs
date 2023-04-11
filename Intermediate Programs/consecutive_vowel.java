package string1;
import java.lang.*;
import java.util.*;

public class consecutive_vowel {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
		String vow="aeiou";
		boolean check=false;
		for(int i=0;i<str.length()-1;++i)
		{
			if(vow.contains(str.charAt(i)+"") && vow.contains(str.charAt(i+1)+""))
			{
				System.out.println("consuitive vowels are found");
				check=true;
				break;
			}
		}
		if(!check)
			System.out.println("not found");
	}
}
