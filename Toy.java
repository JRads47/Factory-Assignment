//Factory Assignment by Jay-Rads Villanueva
public class Toy 
{
	public String n;
	public Toy()
	{
	}
	public Toy(String name)
	{
		n=name;
	}
	public void assemble()
	{
		System.out.println("putting together a "+n);
	}
	public void boxToy()
	{
		System.out.println("putting the "+n+" in a box");
	}
	public void priceToy()
	{
		System.out.println("adding price on "+n);
	}
}
