//Key: weight,brand--> init this using Const-------declare details()

//Keybunch ---> material,Key--->init this using Const---------declare details()

class Key
{
	String brand;
	double weight;
	
	public Key(String brand,double weight)
	{
		this.brand=brand;
		this.weight=weight;
	}
	
	public void details()
	{
		System.out.println("the brand is:"+brand);
		System.out.println("the weight is:"+weight);

	}
}