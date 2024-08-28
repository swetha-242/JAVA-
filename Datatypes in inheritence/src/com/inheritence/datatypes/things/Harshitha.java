package com.inheritence.datatypes.things;

public class Harshitha {
	
	public Shoe shoe;
	
	public void pack()
	{
		if(shoe!=null)
		{
		shoe.safeGuard();
		System.out.println(shoe.brand+shoe.cost);
		}
		else
		{
			System.out.println("shoe is null");
		}
	}

}
