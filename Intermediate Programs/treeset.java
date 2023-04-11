package sets;
import java.io.*;
import java.util.*;
public class treeset {
	public static void main(String[] args)
	{
		int arr[]= {3,4,5,5,44,22,44,66,22,54};
		TreeSet<Integer> ts=new TreeSet<Integer>();
		ts.add(100);
		ts.add(200);
		ts.add(300);
		ts.add(100);
		for(Integer x:arr)
			ts.add(x);
		System.out.println(ts);
		System.out.println(ts.last());
		System.out.println(ts.first());
		System.out.println(ts.contains(300));
		System.out.println(ts.containsAll(ts));
		System.out.println(ts.headSet(44));
		System.out.println(ts.tailSet(44));
		ts.pollFirst();
		System.out.println(ts);
		ts.pollLast();
		System.out.println(ts);
		System.out.println(ts.higher(66));
		System.out.println(ts.lower(66));
		
		

	}
}
