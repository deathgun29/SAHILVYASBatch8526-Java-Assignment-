package practice.day4;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a value for inch:  ");
		float x=sc.nextFloat();
		float y=x*(float)(0.0254);
		
		System.out.println(x+"inche is "+y+ " meters");
		
		
	}

}
