package com.inheritence.datatypes.things;

public class Cancel {
	
	public Amazon amazon;
	
	public void returnn()
	{
		if(amazon!=null)
		{
		amazon.wishList();
		amazon.order();
		amazon.cancel();
		System.out.println(amazon.name+" "+amazon.price);
		}
		else
		{
			System.out.println("amazon cart is null");
		}
	}

}
