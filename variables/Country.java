class Country
{
	public static void setState(String[] states)
	{
     System.out.println("the country includes the states are");
	 for(int start=0;start<states.length;start++)
	 {
		 String ref=states[start];
	   System.out.println("the states founds are:"+ref);
	}
}

	public static void getPin(int[] pincode)
	{
		System.out.println("the country contains pincode are:");
		for(int start1=0;start1<pincode.length;start1++)
		{
			int ref1=pincode[start1];
			System.out.println("the states founds are:"+ref1);
		}	
	}
	
	public static void pM(String[] primeMinister)
	{
	 System.out.println("the country includes the prime Minister are");
	 for(int start2=0;start2<primeMinister.length;start2++)
	 {
		 String ref2=primeMinister[start2];
	   System.out.println("the states founds are:"+ref2);
	}
	}
	
	public static void cM(String[] cabinetMinister)
	{
	 System.out.println("the country includes the prime Minister are");
	 for(int start3=0;start3<cabinetMinister.length;start3++)
	 {
		 String ref3=cabinetMinister[start3];
	   System.out.println("the states founds are:"+ref3);
	}
	}
	
	public static void pP(String[] politicalParties)
	{
	 System.out.println("the country includes the prime Minister are");
	  for(int start4=0;start4<politicalParties.length;start4++)
	 {
		 String ref4=politicalParties[start4];
	   System.out.println("the states founds are:"+ref4);
	}
	}
} 

