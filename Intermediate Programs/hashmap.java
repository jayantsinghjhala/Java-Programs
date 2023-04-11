package string1;
import java.util.*;

public class hashmap {
	public static void main(String[] args)
	{
		String str="JayantSinghJhala";
		HashMap map=new HashMap();
		for(int i=0;i<str.length();i++)
		{
			String c=str.charAt(i)+"";
			
			if(map.containsKey(c))
			{
				int num=Integer.parseInt(map.get(c)+"");
				map.put(c, num+1);
				
			}
			else
			{
				map.put(c,1);
			}
		}
		Iterator itr=map.keySet().iterator();
		while(itr.hasNext())
		{
			String key=(String)itr.next();
			System.out.println("key is "+key.toString()+" value is: "+map.get(key.toString()));
		}
	}
}
