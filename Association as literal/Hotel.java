class Hotel
{
	String name="Anand";//literals where the value is initalized in instance itself
	Owner owner=new Owner("shubhash",36,'M');//literals and its called as association
	//Owner owner=new Owner("shubhash",36,'M'); if we declare it here it creates only one copy of class and prints the continuous output 
	
	public void execute()
	{
		//Owner owner=new Owner("shubhash",36,'M'); if we declare it here it creates  multiple copy of class with the output 
		System.out.println("it runs in this hotel the owner details are");
		System.out.println("it Hotel name is:"+this.name);
		this.owner.execute();
	}
}