class varargsdemo
{
	static void display(String... values)
	{
		System.out.println("disp invoked");
		for(String s:values)
		{
			System.out.println(s);
		}
	}
	public static void main(String args[])
	{
		display();
		display("hello");
		display("my","is","name","sahil");
		int c;
		//for(int i=0;i<200;i++)
		//{
			c=97;
		char b=(char) c;
		System.out.println(b);
	//}
	}
}