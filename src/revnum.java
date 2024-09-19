import java.util.Scanner;

public class revnum
{

	public static void main(String[] args)
	{
		System.out.print("Enter a 5 digit number: ");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		System.out.print("Reverse Number: ");
		for(int i=0; i<5; i++)
		{
			System.out.print(num%10);
			num/=10;
		}
		s.close();

	}

}
