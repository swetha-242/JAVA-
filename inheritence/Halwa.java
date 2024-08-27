package com.java.inheritence;

public class Halwa {
		
		public String name;
		public int price;
		public boolean taste;
		
		public Halwa()
		{
			System.out.println("the sweets has the properties");
		}

		public Halwa(String name, int price, boolean taste)
		{
			super();
			this.name = name;
			this.price = price;
			this.taste = taste;
		}
		
		public void expression()
		{
			System.out.println("Name is:"+this.name);
			System.out.println("price is:"+this.price);
			System.out.println("taste is:"+this.taste);
		}

	}
