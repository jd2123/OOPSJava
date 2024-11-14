import java.util.Scanner;

class circle1
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
	circle1()
	{
		rad =1;
	}
	circle1(double r)
	{
		rad=r;
	}
}

class circlemain
{
	public static void main(String args[])
	{
		circle1 c1 = new circle1();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter radius of the circle: ");
		double r = s.nextDouble();
		circle1 c2 = new circle1(r);
		c1.disp();
		c2.disp();
		s.close();
	}
}
