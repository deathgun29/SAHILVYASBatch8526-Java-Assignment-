package practice.day4;
import java.util.Scanner;
public class Q2 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Year ");
		int x=sc.nextInt();
		if(x%4==0)
		{
			System.out.println("It is a leap year ");
		}
		else
			System.out.println("It is not a leap year ");
	}

}
