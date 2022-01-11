//5. Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the integer. 
//Test Data
//Input an integer between 0 and 1000: 565
//Expected Output :
//The sum of all digits in 565 is 16


package practice.day4;

import java.util.Scanner;

public class Q5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a value ");
		int x=sc.nextInt();
		int r=0;
		int sum=0;
		while(x>0)
		{
		r=x%10;
		sum+=r;
		x=x/10;
		}
				
		System.out.println(sum);
		
		
	}

}
