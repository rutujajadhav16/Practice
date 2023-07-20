package CoreJavaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.Multiset.Entry;

public class CountWordsUsingHashmap {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String s="Hello world java program";
		
		String s1[]=s.split(" ");
		Map<String,Integer> hm=new HashMap<String, Integer>();
		for(int i=0;i<s1.length;i++)
		{
			if(hm.containsKey(s1[i]))
			{
				hm.put(s1[i],hm.get(s1[i])+1);
			}
			else
			{
				hm.put(s1[i],1);
			}
		}
		
		//System.out.println(hm);
		/*Set<String> set=hm.keySet();
		for(String s3:set)
		{
			System.out.println(s3+" "+hm.get(s3));
		}*/
		
		for(Map.Entry<String,Integer> entry:hm.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
		

	}

}
