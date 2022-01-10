import java.io.*;
import mypack.*;
class hv2
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		/*int a[]=new int[5];
		a[0]=Integer.parseInt(args[0]);
		a[1]=Integer.parseInt(args[1]);
		a[2]=Integer.parseInt(args[2]);
		a[3]=Integer.parseInt(args[3]);
		a[4]=Integer.parseInt(args[4]);
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+a[3]+" "+a[4]);*/
		char c=(char) br.read();
		dell o=new dell();
		o.show();
	}
}