class Paper
{
	double thicknes=20;
	int size;
	String color;
	String quality;
	
	public Paper(int size) 
	{
		this.size=size;
	}
	
	public void setColor(String color)
	{
		this.color=color;
	}
	
	public void display()
	{
		System.out.println("the brand is:"+this.thicknes);
		System.out.println("the size is:"+this.size);
		System.out.println("the cost is:"+this.color);
		System.out.println("the output is:"+this.quality);
	}
}