package sets;
import java.util.*;
public class hashset {
	public static void main(String[] args)
	{
		int arr[]= {3,4,5,5,44,22,44,66,22,54};
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(1,"JSJ");
		hm.put(2,"JS");
		hm.put(3,"UK");
		hm.put(4,"NA");
		System.out.println(hm);
		System.out.println(hm.get(2));
		System.out.println(hm.containsKey(11));
		System.out.println(hm.containsValue("JSJ"));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		hm.remove(3);
		System.out.println(hm);
		System.out.println(hm.remove(4,"NA"));
		System.out.println(hm);
		}

}
