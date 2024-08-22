package com.xworkz.java1;

public class BallRunner {
	
	public static void main(String[] args) {

		Ball ball1=new Ball("Wilson","Red",20,500,true,"Circle",3,true);

		Ball ball2=new Ball("Spalding","cement",35,340,false,"traingular",7,true);
		
		Ball ball3=new Ball("Molten","grey",40,640,true,"rounded",9,false);
		
		Ball[] ref=new Ball[3];
		
		ref[0]=ball1;
		ref[1]=ball2;
		ref[2]=ball3;
		
		for(Ball items:ref)
		{
			System.out.println("the plants that contain details are");
			System.out.println(items);
			items.print();
		}
	}

}
