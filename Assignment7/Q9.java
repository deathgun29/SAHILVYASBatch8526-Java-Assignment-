package practice.day4;

import java.util.ArrayList;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a value ");
		int x=sc.nextInt();
		int r=0;
		int i=0,count=0;
		ArrayList<Integer> arr=new ArrayList<>();
		while(x>0)
		{
		r=x%2;
		
		arr.add(r);
		//System.out.println(arr[i]);
		x=x/2;
		i++;
		}
		
		for(int k=arr.size()-1;k>=0;k--)
		{
			System.out.println(arr.get(k));	
			if(arr.get(k)==0)
			{
				count++;
			}
		}
                 
		System.out.println("No.of zero is "+count);
		
		
		
	

}
}
