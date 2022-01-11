package practice.day4;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args)
	{
		int[] arr= {1,4,6,12,100,50,78};
		int sum=0;
		for(int a:arr)
		{
		sum+=a;	
		}
		int avg=sum/arr.length;
		System.out.println("Average is "+avg);
		System.out.print("Number greater tha average ");
		for(int a:arr)
		{
			if(a>avg)
			{
				System.out.print(a+" ");
			}
		}
		
		
		
		
		
	

}

}
