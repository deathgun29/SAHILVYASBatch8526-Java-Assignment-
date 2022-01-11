package practice.day4;
import java.util.Arrays;
import java.util.Scanner;
public class Q11 {
                   
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the value to be removed ");
		int x=sc.nextInt();
		int[] arr= {4,2,6,1,72,12,67,3,9,10};
		int[] arr1=new int[(arr.length-1)];
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(x!=arr[i])
			{
			  arr1[j]=arr[i];	
			  j++;
			}
		}
	
		System.out.println(Arrays.toString(arr1));
	}
}
