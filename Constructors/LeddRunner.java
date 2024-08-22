class LeddRunner
{
	public static void main(String[] args)
	{
	 Ledd ledd=new Ledd();
	 System.out.println("the color is:"+ledd.color);
	 System.out.println("the price1 is:"+ledd.price1);
	 System.out.println("the price1 is:"+ledd.brand);
	 
	 Ledd ledd1=new Ledd("black",40,"syska LED");
	 System.out.println("the color is:"+ledd1.color);
	 System.out.println("the price1 is:"+ledd1.price1);
	 System.out.println("the price1 is:"+ledd1.brand);
	 }
 }