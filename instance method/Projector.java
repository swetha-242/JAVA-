class Projector
{
	String company;
	String type="6 inch display";
	String color;
	char weight;
	
	public Projector(String company) 
	{
		this.company=company;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("the brand is:"+this.company);
		System.out.println("the size is:"+this.type);
		System.out.println("the cost is:"+this.color);
		System.out.println("the output is:"+this.weight);
	}
}