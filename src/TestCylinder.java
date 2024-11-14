class BaseCircle
{
	double r;
	String col;
	BaseCircle()
	{
		r=1;
		col="red";
	}
	
	BaseCircle(double rad)
	{
		r=rad;
	}
	
	BaseCircle(double rad, String color)
	{
		r=rad;
		col=color;
	}
	
	double getRadius()
	{
		return r;
	}
	
	void setRadius(double rad)
	{
		r = rad;
	}
	
	String getColor()
	{
		return col;
	}
	
	void setColor(String color)
	{
		col = color;
	}
	
	double getArea()
	{
		return 3.14*r*r;
	}
}


class Cylinder extends BaseCircle
{
	double h;
	
	Cylinder()
	{
		super();
		h=1;
	}
	
	Cylinder(double rad)
	{
		super(rad);
	}
	
	Cylinder(double rad, double height)
	{
		super(rad);
		h = height;
	}
	
	Cylinder(double rad, double height, String color)
	{
		super(rad, color);
		h=height;
	}
	
	double getHeight()
	{
		return h;
	}
	
	void setHeight(double height)
	{
		h = height;
	}
	
	double getVolume()
	{
		
		return getArea()*h;
	}
}


public class TestCylinder
{

	public static void main(String[] args)
	{
		Cylinder c = new Cylinder();
		Cylinder c1 = new Cylinder(5.0, 4.8, "blue");
		System.out.println(c.getVolume());
		System.out.println(c.getArea());
		System.out.println(c.getColor());
		System.out.println(c1.getVolume());
		System.out.println(c1.getArea());
		System.out.println(c1.getColor());
	}

}
