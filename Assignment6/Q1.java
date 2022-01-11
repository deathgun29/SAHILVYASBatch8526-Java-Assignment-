package practice.Day6;

import java.util.Map.Entry;
import java.util.TreeMap;

public class Q1 {
	public static void main(String[] args)
	{
	TreeMap<Integer, String> map=new TreeMap<Integer ,String>();
	TreeMap<Integer, String> map2=new TreeMap<Integer ,String>();
	map.put(1,"Sahil");
	map.put(2,"ABC");
	map.put(3,"XYZ");
	map.put(4,"JOHN");
	//System.out.println(map);
	for(Entry<Integer, String> m:map.entrySet())
	{
		System.out.println(m.getKey()+" "+m.getValue());
		map2.put(m.getKey(), m.getValue());
	}
	System.out.println(map2);
	}
}
