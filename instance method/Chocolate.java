class Chocolate
{
	String brand="KITKAT";
	double price;
	String flavour;
	char size;
	
	public Chocolate(double price) 
	{
		this.price=price;
	}
	
	public void setFlavour(String flavour)
	{
		this.flavour=flavour;
	}
	
	public void display()
	{
		System.out.println("the country is:"+this.brand);
		System.out.println("the speed] is:"+this.price);
		System.out.println("the fuelaCapacity is:"+this.flavour);
		System.out.println("the noOFThurusters is:"+this.size);
	}
} 