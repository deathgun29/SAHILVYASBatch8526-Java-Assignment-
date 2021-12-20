package practice.day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Q10 {
	public static void main(String[] args)
	{
		long[] arr= {-5,3,6,-2,-8,9,-4,7,2,0};
		long temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
		if(arr[i]>arr[j])
		{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		}
	}
		for(int j=arr.length-1;j>=0;j--)
		{
		System.out.print(arr[j]+", ");
		}
}
}