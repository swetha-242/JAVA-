class Hospital
{
  public static double price(String medicineName)
  {
    System.out.println("the medicine in hospital is");
	System.out.println("the medicine is:"+medicineName);
	if(medicineName=="DOLO")
	{
	  return 20;
	}
	
	if(medicineName=="paracetamol")
	{
	  return 50;
	}
	 return 0;
  }
  
  public static String medicineName(String sympton)
  {
	System.out.println("the sympton in hospital is");
	System.out.println("the sympton is:"+sympton);
	if(sympton=="High Fever")
	{
	  return "DOLO";
	}
	
	if(sympton=="Eye Pain")
	{
	  return "Brimolol";
	}
	 return "Sympton not found"; 
  }
  
  public static boolean availability(String doctorName)
  {
	System.out.println("the doctor in Hospital is");
	System.out.println("the doctorName is:"+doctorName);
	if(doctorName=="shrikanth")
	{
	  return true;
	}
	
	if(doctorName=="Nagaraj")
	{
	  return false;
	}
	 return false; 
  }
}