import java.io.*;
/*class a extends Thread
{
	public void run()
	{
		for (int i=1;i<5 ;i++ ) 
		{
		  System.out.println("from thread a"+i);	
		  try
		  {
		  	Thread.sleep(1000);
		  }
		  catch(Exception e)
		  {
		  	System.out.println("Error");
		  }
		}
		//System.out.println("Exit from a");
	}
}
class b extends Thread
{
	public void run()
	{
		for (int i=1;i<5 ;i++ ) 
		{
		  System.out.println("from thread b"+i);	
		  try
		  {
		  	Thread.sleep(1000);
		  }
		  catch(Exception e)
		  {
		  	System.out.println("Error");
		  }
		}
		//System.out.println("Exit from b");
	}
}*/
class add implements Runnable
{ int n1,n2;
	public add(int x,int y)
	{
         n1=x;
         n2=y;
	}
	public void add1()
	{
		int ad=n1+n2;
		System.out.println(ad);
	}
	public void run()
	{
		//System.out.println("addition is"+(n1+n2));
		add1();
	}
}
class threadsync 
{
	public static void main(String[] args) throws IOException
	{
		add o=new add(3,5);
		Thread t1=new Thread(o);
		t1.start();
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        String ch;
        ch=br.readLine();
        char chary[]=ch.toCharArray();
        for(int i=0;i<ch.length();i++)
        {
         System.out.println(chary[i]);
     }
		/*b o1=new b();
		o.start();                                                                                                  
		try
		  {
		  	Thread.sleep(100);
		  }
		  catch(Exception e)
		  {
		  	System.out.println("Error");
		  }
		o1.start();*/
	}
}