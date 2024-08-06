class Country
{
	String name="INDIA";
	String continent="America";
	State state=new State("Karnataka","Kannada");
	
	public void execute()
	{
	  System.out.println("the country contans all details");
	  System.out.println("the name is:"+this.name);
	  System.out.println("the continent is:"+this.continent);
	  this.state.execute();
	}
}