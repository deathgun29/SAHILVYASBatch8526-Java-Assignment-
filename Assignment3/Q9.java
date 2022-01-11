package Dec14;

import java.util.Arrays;
import java.util.Scanner;

public class Q9 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three numbers");
		//int[] arr=new int[5];
		//arr[0]=1;
		//System.out.println(Arrays.toString(arr));
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		int sum =x+y+z;
		int product=x*y*z;
		int avg=(x+y+z)/3;
		int l=x;
		int s=x;
		if(y>l)
		{
			l=y;
		}
		if(z>l)
			{
			l=z;
			}
		if(y<s)
		{
			s=y;
		}
		if(z<s)
		{
		s=z;	
		}
			System.out.println("Sum of numbers "+sum);
			System.out.println("Product of numbers "+product);
			System.out.println("Average of numbers "+avg);
			System.out.println("Smallest & Largest number "+s+" , "+l);
			
	}

}
