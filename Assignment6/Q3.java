package practice.Day6;

import java.util.Arrays;



public class Q3 {
	public static void main(String[] args)
	{     
		int[] arr= {5,1,4,3,8,2,6,9,12,7};
		int n=arr.length;
	  for(int i=0;i<arr.length;i++)
	  {
		  for(int j=0;j<n-i;j++)
		  {
			  int temp=0;
			  if(arr[j+1]<arr[j])
			  {
				  temp=arr[j];
				  arr[j]=arr[j+1];
				  arr[j+1]=temp;
			  }
			  //System.out.println(arr[j]);
			 // System.out.println(arr[j+1]);
		  }
	  }
	  
	  System.out.print(Arrays.toString(arr));
	 
	}

}
