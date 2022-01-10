/*import java.io.*;
class hv
{
public static void main(String[] args) throws IOException
{
int a;
String b;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
b=br.readLine();
//String g="D";
char c=b.charAt(0);
a =(int) c;
//System.out.println(c);
//System.out.println(a);
//int c=a-65;
for(int j=65;j<=a;j++)
{
for(int i=j;i>=65;i--)
{
	System.out.print((char) i);
}
System.out.println();
}
}
}*/
import java.io.*;
class hhh
{
int i;
	int a=5;
	public int fact(int x)
	{
          int fac=1;
             
        for(int j=1;j<=x;j++)
        {
        	fac=fac*j;
        }
       // System.out.println(fac);
        return fac;
	}
	public void ser()
	{ float sum=0;
		float f;
		for(i=2;i<=a;i++)
		{   f=fact(i+1);
			sum=sum+(i/f);
		//System.out.println(sum);
	    }
		
		sum=sum+1;
		System.out.println(sum);
	}
   
}

class hv
{ 	public static void main(String[] args) 
	{
	 	hhh o=new hhh();
	 	o.ser();
    }
}