package Dec14;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int x=sc.nextInt();
		int fact=1;
		while(x>0)
		{
			fact*=x;
			x--;
		}
		System.out.println("Factorial is "+fact);
	}

}
