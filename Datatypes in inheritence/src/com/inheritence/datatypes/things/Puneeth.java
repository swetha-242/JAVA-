package com.inheritence.datatypes.things;

public class Puneeth {
	
	//it is instance
	public Hat hat;//if we have a instance variable we should do the null check by using if condition
	
	public void fold()
	{
		if(hat!=null)
		{
		hat.shade();
		System.out.println(hat.color);
		}
		else
		{
			System.out.println("Hats is null");
		}
	}

}
