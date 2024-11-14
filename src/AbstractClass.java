abstract class abc
{
	abstract void inAbstractClass();
	
}

class ExampleClass extends abc
{
	void inAbstractClass()
	{
		System.out.println("After redefining");
	}
}

public class AbstractClass
{
	public static void main(String [] args)
	{
		ExampleClass a = new ExampleClass();
		a.inAbstractClass();
	}
}
