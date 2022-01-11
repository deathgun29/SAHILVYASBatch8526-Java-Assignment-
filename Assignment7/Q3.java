package practice.day4;

import java.util.Scanner;

public class Q3 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit ");
		float x=sc.nextFloat();
		float y=(float)5/9;
		float temp=((x-32)*y);
		System.out.println(x+" degree Fahrenheit is equal to "+temp+ " in Celsius  ");
		
		
	}
	}


