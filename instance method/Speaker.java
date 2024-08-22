//init properties using 4 different ways == the 4 properties are literals,reference,contructors,non static method
//Declare a method to print all instance variables

class Speaker
{
	String brand;
	int size;
	double cost;
	boolean output=true;//it is a literals which is declared in the class itself
	
	public Speaker(String brand)//constructor 
	{
		this.brand=brand;
	}
	
	public void setSize(int size)//instance method or non static method 
	{
		this.size=size;
	}
	
	public void display()
	{
		System.out.println("the brand is:"+this.brand);
		System.out.println("the size is:"+this.size);
		System.out.println("the cost is:"+this.cost);
		System.out.println("the output is:"+this.output);
	}
} 