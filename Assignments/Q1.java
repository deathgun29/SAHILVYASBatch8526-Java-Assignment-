//Password Validation
//Password must be characters and digits only!!
//Minimum password length must be 10 with minimum 2 digit 

package practice.day4;
import java.util.*;
import java.util.Scanner;
public class Q1 {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String password=sc.nextLine();
		char[] pass_arr=password.replaceAll(" ","").toCharArray();
//		char ch='1';
//		int x=(int)ch;               //to check ascii value
//		System.out.println(x);
		int flag=0,numflag=0;
		
		for(char a:pass_arr)
		{
			if(pass_arr.length<10)   //A=65 a=97 , 0=48  Sahilvyas9@   flag=11 
			{
			break;	//65-90= A-Z   97-122      48-57
			}
			if(((int)a>=65 && (int)a<=90) || ((int)a>=97 && (int)a<=122) || ((int)a>=48 && (int)a<=57))
			{ 
				if(((int)a>=48 && (int)a<=57))
				{
					numflag++; 
				}
				
			  flag++;
			}
		}
		if(flag==pass_arr.length && numflag>=2) //
			
		{
			System.out.println("Valid Password :) ");
		}
		else
			System.out.println("Invalid Password :( ");
	}

}