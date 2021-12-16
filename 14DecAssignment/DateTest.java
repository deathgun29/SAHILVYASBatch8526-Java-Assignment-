package Dec14;
class Date
{
	private int month;
	private int day;
	private int year;
	
	Date()
	{
		month=0;
		day=0;
		year=0;
		
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	void DisplayDate()
	{
		System.out.println(getMonth()+"/"+getDay()+"/"+getYear());
	}
	
}
public class DateTest {
	
public static void main(String[] args)
{
	Date d=new Date();
	d.setDay(23);
	d.setMonth(7);
	d.setYear(2002);
	d.DisplayDate();
}
}
