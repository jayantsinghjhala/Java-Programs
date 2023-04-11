package collection;
import java.util.*;
public class common_in_3_array 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		ArrayList<Integer> ar2=new ArrayList<Integer>();
		ArrayList<Integer> ar3=new ArrayList<Integer>();
		ar1.add(100);
		ar1.add(200);
		ar2.add(100);
		ar3.add(100);
		ar1.retainAll(ar2);
		ar1.retainAll(ar3);
		System.out.println(ar1);
		
	}
	
}