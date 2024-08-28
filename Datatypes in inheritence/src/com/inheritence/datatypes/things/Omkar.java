package com.inheritence.datatypes.things;

public class Omkar {

	public void buy(Shoe shoe)
	{
		if(shoe!=null)
		{
		shoe.safeGuard();
		System.out.println(shoe.brand+" "+shoe.cost);
		}
		else
		{
			System.out.println("shoe is null");
		}
	}
}
