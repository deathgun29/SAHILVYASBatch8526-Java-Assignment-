package Dec14;

public class Fibo {
	public static void main(String[] args)
	{
	int a=0;
	int b=1;
	int i=0;
	int c=0;
	System.out.println(b);
	while(i<10)
	{
		c=a+b;
		a=b;
		b=c;
		System.out.println(c);
		i++;
	}

}
}