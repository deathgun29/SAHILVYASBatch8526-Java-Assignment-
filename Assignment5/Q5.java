package practice.Day6;

import java.util.LinkedList;
import java.util.Scanner;

public class Q5 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	//int[] arr= {2,5,7,8,4,9,12,45,33};
	LinkedList <Integer> l1=new LinkedList<> ();
	l1.add(2);
	l1.add(5);
	l1.add(7);
	l1.add(8);
	l1.add(9);
	l1.add(12);
	l1.add(45);
	l1.add(33);
	
	System.out.println("Linked List "+l1);
	System.out.println("Which elemnet you want to replace ");
	int x=sc.nextInt();
	System.out.println("Element you want to replace with? ");
	int y=sc.nextInt();
	int flag=0;
	for(Integer i:l1)
	{ 
		System.out.println((i));
		if(i==x)
		{
			l1.set(flag, y);
		}
		flag++;
		
	}
	
	System.out.println("After inserting element "+l1);
	
	}
}
