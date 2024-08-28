package com.inheritence.datatypes.things;

public class Home {
	
	public void deliver()
	{
		Amazon amazon=new Amazon();
		amazon.wishList();
		amazon.order();
		amazon.cancel();
		System.out.println(amazon.name+" "+amazon.price);
	}

}
