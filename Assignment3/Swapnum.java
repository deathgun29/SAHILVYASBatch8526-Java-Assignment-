package Dec14;

import java.util.Scanner;

public class Swapnum {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st number");
		int x=sc.nextInt();
		System.out.println("Enter 2st number");
		int y=sc.nextInt();
		System.out.println("Numbers before swap, x = "+x+"  y = "+y);
		int temp=x;
		x=y;
		y=temp;
		System.out.println("Numbers after swap is x = "+x+"  y = "+y);
	}

}
