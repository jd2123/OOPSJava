class BaseBox
{
	int l;
	int w;
	BaseBox()
	{
		l=0;
		w=0;
	}
	BaseBox(int a, int b)
	{
		l=a;
		w=b;
	}
	int area()
	{
		return l*w;
	}
	
}
class Box3D extends BaseBox
{
	int h;
	Box3D()
	{
		super();
		h=0;
	}
	Box3D(int a, int b, int c)
	{
		super(a,b);
		h=c;
	}
	int volume()
	{
		return l*w*h;
	}

}

public class InheritedBoxDemo
{
	public static void main(String args[])
	{
		Box3D b1 = new Box3D();
		BaseBox b2 = new BaseBox();
		BaseBox b3 = new BaseBox(5,2);
		Box3D b4 = new Box3D(7, 8, 10);
		System.out.println(b1.volume());
		System.out.println(b2.area());
		System.out.println(b3.area());
		System.out.println(b4.volume());
		
		
	}
}
