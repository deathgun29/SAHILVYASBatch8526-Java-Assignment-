package practice.day4;
 class MySingleton
{
	public static int sq_area=0;                              //Static variable for storing area 
	public String text;                                       //A String
	static MySingleton obj=new MySingleton(4,8);              //Static Object created so that this obj cannot be copied & passing two integer values for parameterized constructor 
	private MySingleton(int length, int breath)               //Private constructor created, only object/instance of this class can access it.  
	{                                                         //It's a parameterized Constructor taking two integer values 
	     int len=length;                                      // assigning len its value
	     int bth=breath;
	     sq_area=len*bth;
	     text="Area of Square is ";
	}
	public static MySingleton getObj()
	{
		return obj;
	}
	
}
public class Singletonexample {
	
	public static void main(String[] args)
	{
		MySingleton obj2=MySingleton.getObj();
		
		System.out.println(obj2.text+obj2.sq_area);
	}

}
