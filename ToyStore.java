//Factory Assignment by Jay-Rads Villanueva
public class ToyStore 
{
	public ToyStore()
	{
	}
	public Toy orderToy(String toyType)
	{
		Toy toy;
		if(toyType.equals("doll"))
		{
			toy= new Doll();
			toy.assemble();
			System.out.println("");
			toy.boxToy();
			System.out.println("");
			toy.priceToy();
		}
		else if(toyType.equals("car"))
		{
			toy = new Car();
			toy.assemble();
			System.out.println("");
			toy.boxToy();
			System.out.println("");
			toy.priceToy();
		}
		else if(toyType.equals("rattle"))
		{
			toy= new Rattle();
			toy.assemble();
			System.out.println("");
			toy.boxToy();
			System.out.println("");
			toy.priceToy();
		}
		else
		{
			toy= new Doll();
			toy.assemble();
			System.out.println("");
			toy.boxToy();
			System.out.println("");
			toy.priceToy();
		}
		return toy;
	}
}
