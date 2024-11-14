
public class ExceptionHandlingEx
{

	public static void main(String[] args)
	{
		try
		{
			throw new ArithmeticException("My own Exception...");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("From Finally Block...");
		}
	}

}
