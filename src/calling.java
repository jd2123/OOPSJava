class test1
{
	int a;
	void inca()
	{
		a += 100;
	}
	void inca(int x)
	{
		x += 200;
		System.out.println("From inca function: "+x);
	}
}
public class calling
{

	public static void main(String[] args)
	{
		test1 t1 = new test1();
		t1.a=500;
		System.out.println("From main a = "+t1.a);
		t1.inca();
		System.out.println("From main after calling inca a = "+t1.a);
		t1.inca(t1.a);
		System.out.println("From main after calling inca a = "+t1.a);
	}

}
