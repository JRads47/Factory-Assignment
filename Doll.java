//Factory Assignment by Jay-Rads Villanueva
public class Doll extends Toy
{
	public String n;
	public Doll()
	{
		n="doll";
	}
	public void assemble()
	{
		System.out.println("Putting together a doll");
		System.out.println("Connecting all pieces");
		System.out.println("Painting the face");
		System.out.println("Adding the dress");
		System.out.println("Adding the shoes");
	}
	public void boxToy()
	{
		System.out.println("Putting the doll in a box");
	}
	public void priceToy()
	{
		System.out.println("Adding price on doll");
	}
}
