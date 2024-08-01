class Aquarium
{
	String color;
	int price;
	String brand;
	
    Aquarium(String color,int price,String brand)
	{
		this.color=color;
		this.price=price;
		this.brand=brand;
		System.out.println("the SimCard least is created:");
		
	}
	
	Aquarium()
	{
		
	}
	
	Aquarium(String color,int price)
	{
		this.color=color;
		this.price=price;
		System.out.println("the SimCard least is created:");
		
	}
	
	Aquarium(String color)
	{
		this.color=color;
		System.out.println("the SimCard least is created:");
		
	}
	
}