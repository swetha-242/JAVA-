class DeliveryGuy
{
  public static void deliver(String item)
  {
    System.out.println("the Delivery guy runs with only item");
	System.out.println("item:"+""+item);
	DeliveryVehicle.deliver(item,"Fixed");
  }
}