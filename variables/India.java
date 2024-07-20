class India
{
	//Task: declare a method take code(we should write inside a paranthesis) and return country(we shold written the country)
  public static String country(double code)
  {
    System.out.println("the country in india is");
	System.out.println("the code is:"+code);
	if(code==577201)
	{
	  return "shivamogga";//in the conditions, or in any body of the inside method we must use the return statement only once 
	}
	
	if(code==534251)
	{
	  return "bengaluru";
	}
	
	if(code==577202)
	{
	  return "davangere";
	}
	
	if(code==577435)
	{
	  return "mysore";
	}
	 return " country not found";//the return statement can be used only within the country method 
	 //the return statement can be used as many times inside the method country and also in any methods
  }
  
  //Task: declare method take item and return price
  public static double price(String item)
  {
	System.out.println("the item in india is");
	System.out.println("the item is:"+item);
	if(item=="palav")
	{
	  return 50;
	}
	
	if(item=="pav Bajji")
	{
	  return 80;
	}
	
	if(item=="Masala Dose")
	{
	  return 60;
	}
	
	if(item=="Egg Biriyani")
	{
	  return 100;
	}
	 return 0; 
  }
  
  //Task: declare method take moviename and return producer name
  public static String producerName(String movieName)
  {
	System.out.println("the movies in india is");
	System.out.println("the movieName is:"+movieName);
	if(movieName=="Milana")
	{
	  return "Bharath";
	}
	
	if(movieName=="ABCD")
	{
	  return "Shetty";
	}
	
	if(movieName=="Student of the year")
	{
	  return "John Megohn";
	}
	
	if(movieName=="3 idiots")
	{
	  return "Gaurav";
	}
	 return "Producer Name not found"; 
  }
}