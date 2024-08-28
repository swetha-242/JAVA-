package com.inheritence.datatypes.things;

public class Shoe {
	
	public String brand="PUMA";
	public int cost=60;
	
	public Shoe()
	{
		System.out.println("the argumets runs in non parameterized constrctor");
	}
	
	public void safeGuard()
	{
		System.out.println("the shoe which will safeguard the legs");
	}
	
	public void enhanceWalk()
	{
		System.out.println("the shoe will helps us to wlk with free");
	}

}
