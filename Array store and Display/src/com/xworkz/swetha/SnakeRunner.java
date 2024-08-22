//to format the code in order the way is ctrl+shift+f:

package com.xworkz.swetha;

public class SnakeRunner {

	public static void main(String[] args) {
		
		Snake snake1=new Snake("cobra",50,"wild");
		
		Snake snake2=new Snake("nagarahavu",30,"forest");
		
		Snake snake3=new Snake("urumadla",40,"water");
		
		Snake[] ref=new Snake[3];//created array 
		
		ref[0]=snake1; 
		ref[1]=snake2;
		ref[2]=snake3;
		
		for(Snake element:ref)//for each loop
			//for(classname anynamegiven:ref of an array)
		{
			System.out.println(element);
			System.out.println("the snake are created in list");
			element.print();
		}
	}

}
