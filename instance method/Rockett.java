class Rockett
{
	String country="INDIA";
	double speed;
	String fuelaCapacity;
	int noOfThurusters;
	
	public Rockett(double speed) 
	{
		this.speed=speed;
	}
	
	public void setfuelaCapacity(String fuelaCapacity)
	{
		this.fuelaCapacity=fuelaCapacity;
	}
	
	public void display()
	{
		System.out.println("the country is:"+this.country);
		System.out.println("the speed] is:"+this.speed);
		System.out.println("the fuelaCapacity is:"+this.fuelaCapacity);
		System.out.println("the noOFThurusters is:"+this.noOfThurusters);
	}
} 