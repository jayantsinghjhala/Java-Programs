package collection;

import java.util.ArrayList;

public class covertarraytoarraylist {
	public static void main(String[] args) 
	{
		int arr[]= {3,4,5,44,66,22,54};
		ArrayList<Integer> ar1=new ArrayList<Integer>();
		for(int x:arr)
			ar1.add(x);
		System.out.println(ar1);
		
	}
}
