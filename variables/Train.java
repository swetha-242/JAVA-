class Train
{
   public static void book(String source,String destination)
    {
       System.out.println("the train containing the details are");
	   System.out.println("Source"+"-"+source);
	   System.out.println("Destination"+"-"+destination);
    }
	
	public static void book(String source,String destination,double quantity)
	{
	   System.out.println("the train containing the details are");
	   System.out.println("Source"+"-"+source);
	   System.out.println("Destination"+"-"+destination);
	   System.out.println("Quantity"+"-"+quantity);
	}
	
	public static void book(String source,String destination,double quantity,double price)
	{
	   System.out.println("the train containing the details are");  
	   System.out.println("Source"+"-"+source);
	   System.out.println("Destination"+"-"+destination);
	   System.out.println("Quantity"+"-"+quantity);
	   System.out.println("Price"+"-"+price);
	}
	
	public static void cancel(double ticketNo)
	{
	   System.out.println("the train containing the details of cancel are");
       System.out.println("TicketNo"+"-"+ticketNo);	 	   
	}
	
	public static void cancel(String source,String destination)
    {
       System.out.println("the train containing the details of cancel are");
	   System.out.println("Source"+"-"+source);
	   System.out.println("Destination"+"-"+destination);
    }

	public static void main(String[] args)
	{
		System.out.println("the parameters passed to all values if train");
		Train.book("Shivamogga","Bengalore");
		Train.book("Hassan","chikmangalore",2670);
		Train.book("sagara","thumkur",528,15000);
		Train.cancel(34527);
		Train.cancel("Ballary","Goa");
	}
}