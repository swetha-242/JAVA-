//SoftwareEnginner: name,experience,designation,salary : constructor----Declare a method to print details

//Company : id,name,location: constructor ,SoftwareEnginner:literal------Declare a method to print details

class SoftwareEnginner
{
	String name;
	int experience;
	String designation;
	double salary;
	
	public SoftwareEnginner()
	{
	
	}
	
	public SoftwareEnginner(String name,int experience,String designation,double salary)
	{
		this.name=name;
		this.experience=experience;
		this.designation=designation;
		this.salary=salary;
	}
	
	public void execute()
	{
		System.out.println("the Name is:"+this.name);
		System.out.println("the Experience is:"+this.experience);
		System.out.println("the Designation is:"+this.designation);
		System.out.println("the Salary is:"+this.salary);
	}
}