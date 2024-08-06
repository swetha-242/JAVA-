//Owner : name,age,gender : constructor---Declare a method to print details

//Hotel : name:literal, Owner:literal-----Declare a method to print details

class Owner
{
	String name;
	int age;
	char gender;
	
	public Owner()
	{
	
	}
	
	public Owner(String name,int age,char gender)
	{
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	public void execute()
	{
		System.out.println("the Name is:"+this.name);
		System.out.println("the Age is:"+this.age);
		System.out.println("the Gender is:"+this.gender);
	}
}