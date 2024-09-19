
class Box
{
	double width;
	double height;
	double depth;
	void setDim(double w, double h, double d)
	{
		width=w;
		height=h;
		depth=d;
	}
	void vol ()
	{
		System.out.println("The volume is: " + width*height*depth);
	}
	
	Box(double s)
	{
		height=width=depth=s;
	}
	
	Box()
	{
		height=0;
		width=0;
		depth=0;
	}
	
	Box(double w, double h, double d)
	{
		height=h;
		width=w;
		depth=d;
	}
}

public class BoxDemo
{
	public static void main(String args[])
	{
		Box b1 = new Box();
		b1.setDim(100.0, 200.0, 300.0);
		b1.vol();
		Box b2 = new Box(44.6, 66.4, 78.4);
		b2.vol();
		Box b3 = new Box(20);
		b3.vol();
		//This is Method Overloading where we are using method Box 3 times each time
		//it is defined differently and used differently. It is implementing Polymorphism.
	}
}