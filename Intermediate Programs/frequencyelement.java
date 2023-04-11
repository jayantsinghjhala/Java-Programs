package sets;

import java.util.HashMap;
import java.util.Map;

public class frequencyelement {
	public static void main(String[] args)
	{
		int arr[]= {3,4,3,22,5,5,44,22,44,66,22,5,54};
		HashMap<Integer, Integer> hm=new HashMap<Integer,Integer>();
		for(int i:arr)
		{
			Integer count=hm.get(i);
			if(count==null)
				hm.put(i,1);
			else
				hm.put(i,++count);
		}
		System.out.println(hm);
		int i=0;
		int index=0;
		for(Map.Entry<Integer, Integer> en:hm.entrySet())
		{
			if(en.getValue()>i)
			{
				i=en.getValue();
				index=en.getKey();
			}
			//System.out.println(en.getKey()+" : "+en.getValue());
		}
		System.out.println("Highest occuring element: "+index);
	}


}
