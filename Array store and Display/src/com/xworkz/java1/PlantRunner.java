package com.xworkz.java1;

public class PlantRunner {

	public static void main(String[] args) {

		Plant plant1=new Plant("Rose","Red",20,500,true);

		Plant plant2=new Plant("hibiscus","pink",35,340,false);
		
		Plant plant3=new Plant("jasmine","yellow",40,640,true);
		
		Plant[] ref=new Plant[3];
		
		ref[0]=plant1;
		ref[1]=plant2;
		ref[2]=plant3;
		
		for(Plant items:ref)
		{
			System.out.println("the plants that contain details are");
			System.out.println(items);
			items.print();
		}
	}

}
