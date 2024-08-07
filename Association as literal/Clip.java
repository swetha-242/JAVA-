//Clip --> color,type --> init this using Const-----declare details()

//Ganavi---> email,Clip--> init this using Const----declare details()

class Clip
{
	String color;
	boolean type;
	
	public Clip(String color,boolean type)
	{
		this.color=color;
		this.type=type;
	}
	
	public void details()
	{
		System.out.println("the clip' is:"+color);
		System.out.println("the type is:"+type);

	}
}