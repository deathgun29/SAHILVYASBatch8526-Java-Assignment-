package Dec16;
import static java.lang.System.*;
public class Q3 {
	int value=50;
	
//	void passbyvalue(int value)
//	{
//		value=value+100;
//	System.out.println(value);	
//	}
	
	void passbyref(Q3 q)
	{
		//System.out.println(value);
	   q.value=q.value+100;	
	   System.out.println(value);
	}
	public static void main(String[] args)
	{
		Q3 q=new Q3();
		//q.passbyvalue(90);
		q.passbyref(q);
	out.println(q.value);
	}

}
