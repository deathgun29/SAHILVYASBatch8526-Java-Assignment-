package Dec14;

import java.util.Arrays;
//import java.util.Collections;
import java.util.List;

public class Q8 {
	
	public static List<Object> getDetails()
	{
		int age=21;
		String name="sahil";
		char gen='m';
		return Arrays.asList(age,name,gen);
	}
	
	public static void main(String[] args)
	{
		List<Object> obj=getDetails();
		System.out.println(obj);
	}

}
