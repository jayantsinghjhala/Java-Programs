package string1;
import java.util.*;
import java.lang.*;
public class square_of_numbers_in_string {
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		/*boolean check=str.matches("[0-9]+");
		if(check)
		{
			System.out.println("Number");
		}
		else
		{
			System.out.println("Not a Number");
		}*/
		try 
		{
			Integer.parseInt(str);
			System.out.println("Number");
		}
		catch(Exception e)
		{
			System.out.println("Not a Number");
		}
	}

}
