//Knife--> weight,height--> init this using Const-----declare details()

//Ananya---> mobile,Knife --->init this using Const-----declare details()

class Knife
{
	int height;
	int weight;
	
	public Knife(int height,int weight)
	{
		this.height=height;
		this.weight=weight;
	}
	
	public void details()
	{
		System.out.println("the height' is:"+height);
		System.out.println("the weight is:"+weight);

	}
}