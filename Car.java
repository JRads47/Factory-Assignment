//Factory Assignment by Jay-Rads Villanueva
public class Car extends Toy
{
	public String n;
	public Car()
	{
		n="car";
	}
	public void assemble()
	{
		System.out.println("Putting together a car");
		System.out.println("Make the body");
		System.out.println("Add the wheels");
		System.out.println("Paint the car");
	}
	public void boxToy()
	{
		System.out.println("Putting the car in a box");
	}
	public void priceToy()
	{
		System.out.println("Adding price on car");
	}
}
