//Factory Assignment by Jay-Rads Villanueva
public class Rattle extends Toy
{
	public String n;
	public Rattle()
	{
		n="rattle";
	}
	public void assemble()
	{
		System.out.println("Putting together a rattle");
		System.out.println("Create the frame");
		System.out.println("Add the pebbles");
		System.out.println("Secure the sides");
	}
	public void boxToy()
	{
		System.out.println("Putting the rattle in a box");
	}
	public void priceToy()
	{
		System.out.println("Adding price on rattle");
	}
}
