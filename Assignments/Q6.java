package practice.day4;

import java.util.Scanner;

public class Q6 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input no.of days ");
		int x=sc.nextInt();
		int y=0;
		int year=0;
		int days=0;
		if(x%365>=0)
		{
		 year=x/365;
		 //System.out.println(year);
		 x=x%365;
		 
		}
		
		
		System.out.println(year+"Years "+x+ " Days");
		
		
	}

}
