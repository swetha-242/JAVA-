class Hotel
{
	String name="Anand";//literals where the value is initalized in instance itself
	Owner owner=new Owner("shubhash",36,'M');//literals
	
	public void execute()
	{
		System.out.println("it runs in this hotel the owner details are");
		System.out.println("it Hotel name is:"+this.name);
		this.owner.execute();
	}
}