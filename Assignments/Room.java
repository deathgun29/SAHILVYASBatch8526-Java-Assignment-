package Dec16;

public class Room {
	int roomno;                    //data members created
	String roomtype;
	float roomarea;
	String Acmachine;
	void setdata(int rno,String rtype,float rarea,String ac)       //setdata function with 4 parameters
	{
	 roomno=rno;
	 roomtype=rtype;
	 roomarea=rarea;
	 Acmachine=ac;
	}
	void displaydata()      //displaydata() to print all the details of room
	{
	System.out.println("Room no "+roomno+", Room type "+roomtype+", Room Area "+roomarea+", AC Machine"+Acmachine);
		
	}
	public static void main(String[] args)
	{
		Room r=new Room();   //object "r" created of class room
		r.setdata(101,"1BHK", 456.00f,"Yes");      //setdata function called with passing parameters
		r.displaydata();                           //display data called
		
	}

}
