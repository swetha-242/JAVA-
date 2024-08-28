package com.inheritence.datatypes.things;

public class Sudeep {
	
	public void tear(Hat hat)//it is parameter
	{
		if(hat!=null)
		{
		hat.shade();
		System.out.println(hat.color);
		}
		else
		{
			System.out.println("Hat is null");
		}
	}

}
