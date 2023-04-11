package collection;
import java.util.*;

public class factorial {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number for factorial:");
		int n=sc.nextInt();
		factorial obj=new factorial();
		
		System.out.println("Factorial of "+n+" is: "+obj.fact(n));
	}

public int fact(int n)
{
	if(n<=0)
	{
		return 1;
	}
	else {
		return n*fact(n-1);
	}
}
}
