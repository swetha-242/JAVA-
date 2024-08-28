package com.inheritence.datatypes.things;

//the class Ganesh used in 6 ways-->instance,local,static,parameter,parent,return
public class Ganesh {
	
	public void wear()
	{
		//it is local
		//hat is reference which access the variables and methods
		Hat hat=new Hat(); //creating and initializing the Hat
		
		hat.shade();
		System.out.println(hat.color);//it prints color white where we assign value in Hat.java
	}

}
