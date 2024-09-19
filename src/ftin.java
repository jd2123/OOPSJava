
class Dist
{
	float ft, in;
	
	Dist()
	{
	}
	
	Dist(float a, float b)
	{
		ft=a;
		in=b;
	}
	
	void sum(Dist d1)
	{
		float rf, ri;
		rf=this.ft + d1.ft;
		ri=this.in + d1.in;
		
		if(ri > 12)
		{
			rf+=1;
			ri-=12;
			System.out.println("Distance: "+ rf + "ft "+ ri+ "in");
		}
		else
		{
			System.out.println("Distance: "+ rf + "ft "+ ri+ "in");
		}
	}
	
	void get()
	{
		System.out.println(ft + "ft "+ in+ "in");
	}
	
	void set(float a, float b)
	{
		ft=a;
		in=b;
	}
	
}

public class ftin
{
	public static void main(String args[])
	{
		Dist d1 = new Dist();
		Dist d2 = new Dist(7,11);
		d1.set(13, 11);
		d1.sum(d2);
	}
}