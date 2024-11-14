class Point
{
	private float x, y;
	
	Point()
	{
		x=0;
		y=0;
		
	}
	
	Point(float a)
	{
		x=a;
		y=0;
	}
	Point(float a, float b)
	{
		x=a;
		y=b;
	}
	
	public String get()
	{
		//System.out.println("Point: ("+x+","+y+")");
		return "("+x+" "+y+")";
	}
	
	public void set(float a, float b)
	{
		x=a;
		y=b;
	}
	
	public float dist(Point p1, Point p2)
	{
		double d;
		d = Math.sqrt((Math.pow((p1.x - p2.x),2) + Math.pow((p1.y - p2.y),2)));
		
		return (float)d;
		
	}
}
public class Distance
{

	public static void main(String[] args)
	{
		Point p1 = new Point();
		Point p2 = new Point();
		Point p3 = new Point();
		Point p4 = new Point();
		Point p5 = new Point(3.5355339f);
		Point p6 = new Point(0, 3.5355339f);
		
		
		p3.set(78.0f, 67.45f);
		p4.set(49.98f, 23.87f);
	
		System.out.println("Distance between Point 1 " + p1.get() + " and Point 2 "+p2.get()+" is: "+p1.dist(p1, p2));
		System.out.println("Distance between Point 3 " + p3.get() + " and Point 4 "+p4.get()+" is: "+p3.dist(p3, p4));
		System.out.println("Distance between Point 5 " + p5.get() + " and Point 6 "+p6.get()+" is: "+p5.dist(p5, p6));
	}

}
