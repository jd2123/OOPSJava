
class test
{
	int a, b, c;
	void setabc()
	{
		a=b=c=100;
	}
	void setabc(int x, int y, int z)
	{
		a=x;	b=y;	c=z;
	}
	void setabc(int x, int y)
	{
		a=x;	b=y;	c=0;
	}
	void setabc(int a)
	{
		this.a = a;	b=a;	c=a;
	}
}

public class methodoverloading
{
	public static void main(String[] args)
	{
		test t1 = new test();
		test t2 = new test();
		test t3 = new test();
		test t4 = new test();
		t1.setabc();
		t2.setabc(10, 20, 30);
		t3.setabc(40, 100);
		t4.setabc(400);
		System.out.println(t1.a+"\t"+t1.b+"\t"+t1.c);
		System.out.println(t2.a+"\t"+t2.b+"\t"+t2.c);
		System.out.println(t3.a+"\t"+t3.b+"\t"+t3.c);
		System.out.println(t4.a+"\t"+t4.b+"\t"+t4.c);
	}
}
