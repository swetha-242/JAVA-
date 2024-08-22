package com.xworkz.java1;

public class SubmarineRunner {

	public static void main(String[] args) {
		
		Submarine submarine1=new Submarine("Nautilus ","blue",10,430,false);

		Submarine submarine2=new Submarine("Seawolf","white",60,640,false);
		
		Submarine submarine3=new Submarine("Los Angeles","grey",32,760,true);
		
		Submarine[] ref=new Submarine[3];
		
		ref[0]=submarine1;
		ref[1]=submarine2;
		ref[2]=submarine3;
		
		for(Submarine items:ref)
		{
			System.out.println("the submarine that contain details are");
			System.out.println(items);
			items.print();
		}
	}

}

