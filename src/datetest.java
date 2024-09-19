import java.util.Scanner;

class date
{
	int day, month, year;
	
	void dispdate()
	{
		System.out.println("Given Date is: "+day+"/"+month+"/"+year);
	}
	
	date()
	{
		day=1;
		month=1;
		year=2000;
	}
	date(int d, int m, int y)
	{
		day=d;
		month=m;
		year=y;
	}
}
public class datetest
{
	public static void main(String[] args)
	{
		date d1 = new date();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Day, Month, Year: ");
		int d = s.nextInt();
		int m = s.nextInt();
		int y = s.nextInt();
		date d2 = new date(d, m, y);
		d1.dispdate();
		d2.dispdate();
		s.close();
	}
}
