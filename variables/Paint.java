class Paint
{
   public static void menu(String brand)//its is the parameter where the local variable which is declared inside the paranthesis is called parameter
    {
		//the varaible that is declared within the body in the method is called local variable
       System.out.println("the paint consist of the single parameter brand");
	   System.out.println("Brand"+"-"+brand);
    }
	
	public static void menu(String brand,String color)
	{
	   System.out.println("the paint consist of the two parameter brand");
	   System.out.println("Brand"+"-"+brand);
	   System.out.println("Color"+"-"+color);
	}
	
	public static void menu(String brand,double price)
	{
	   System.out.println("the paint consist of the two parameter brand");  
	   System.out.println("Brand"+"-"+brand);
	   System.out.println("Price"+"-"+price);
	}
	
	public static void menu(String color,String type,double price)
	{
	   System.out.println("the paint consist of the two parameter brand");
       System.out.println("Color"+"-"+color);	 
       System.out.println("Type"+"-"+type);
       System.out.println("Price"+"-"+price);	   
	}

	public static void main(String[] args)
	{
		System.out.println("the parameters passed to all values are");
		Paint.menu("phinolex");//if we written inside the paranthesis like("phinolex") it is called as an argument
		Paint.menu();//if we give paint.menu() without any value inside pranthesis it shows an error and it shows No-argument error
		Paint.menu("eipaint",30000);//the reference which is given inside the parameter is called argument
		Paint.menu("white","liquid",25000);
	}
}