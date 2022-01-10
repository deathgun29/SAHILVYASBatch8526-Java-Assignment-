import java.io.*;
class hv1
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
System.out.println(c);
System.out.println(a);
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
}
