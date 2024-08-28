package com.inheritence.datatypes.things;

public class Office {
	
	public void parcel(Amazon amazon)
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
