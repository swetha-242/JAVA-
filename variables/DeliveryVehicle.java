class DeliveryVehicle
{
  public static void deliver(String item,String location)
  {
     System.out.println("the Delivery vehicle runs with deliver for both");
	 System.out.println("item:"+""+item);
	 System.out.println("location:"+""+location);
	 Company.deliver(item,location);
  }
}