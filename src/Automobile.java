import java.util.Scanner;

class Vehicle
{
	void display()
	{
		System.out.println("This is a Vehicle");
	}
}

class Car extends Vehicle
{
	void display()
	{
		System.out.println("This is a Car");
	}
}

class Bike extends Vehicle
{
	void display()
	{
		System.out.println("This is a bike");
	}
}

public class Automobile
{

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number of Tyres of the Vehicle: ");
		int N = s.nextInt();
		s.close();
		switch(N)
		{
			case 2: 
				Bike b = new Bike();
				b.display();
				break;
				
			case 4:
				Car c = new Car();
				c.display();
				break;
				
			default:
				Vehicle v = new Vehicle();
				v.display();		
		}

	}

}
