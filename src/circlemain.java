import java.util.Scanner;

class circle
{
	double rad;
	
	double area()
	{
		return 3.14*rad*rad;
	}
	double circ()
	{
		return 2*3.14*rad;
	}
	void disp()
	{
		System.out.println("The area of circle with radius "+rad+" is = "+area());
		System.out.println("The circumference of circle with radius "+rad+" is = "+circ());
	}
	circle()
	{
		rad =1;
	}
	circle(double r)
	{
		rad=r;
	}
}

class circlemain
{
	public static void main(String args[])
	{
		circle c1 = new circle();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double r = s.nextDouble();
		circle c2 = new circle(r);
		c1.disp();
		c2.disp();
		s.close();
	}
}
