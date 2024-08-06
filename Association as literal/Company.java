class Company
{
    int id=1;
	String name="TCS";
	String location="bengaluru";
	SoftwareEnginner softwareEnginner=new SoftwareEnginner("raghu",14,"Software Developer",60000);
	
	public void execute()
	{
		System.out.println("it runs in this Company the SoftwareEnginner details are");
		System.out.println("it company id is:"+this.id);
		System.out.println("it company name is:"+this.name);
		System.out.println("it company location is:"+this.location);
		this.softwareEnginner.execute();
	}
}