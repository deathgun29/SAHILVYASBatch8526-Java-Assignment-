package practice.Day6;

import java.util.TreeMap;
import java.util.Map.Entry;

public class Q2 {
	public static void main(String[] args)
	{
	TreeMap<Integer, String> map=new TreeMap<Integer ,String>();
	TreeMap<Integer, String> map2=new TreeMap<Integer ,String>();
	int k=1;
	map.put(1,"Sahil");
	map.put(2,"ABC");
	map.put(3,"XYZ");
	map.put(4,"JOHN");
	//System.out.println(map);
	for(Entry<Integer, String> m:map.entrySet())
	{
		if(k==m.getKey())
		{
		System.out.println(m.getKey()+" "+m.getValue());
		break;
		}
	}

}
}