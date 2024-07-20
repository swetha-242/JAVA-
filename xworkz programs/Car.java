class Car
{
public static void horn()
{
  System.out.println("running car please horn");
}
public static void stop()
{
  System.out.println("running car please stop");
  cooler();//invoke static method cooler from the same calss Car
}
public static void cooler()
{
  System.out.println("running car please cooler the car");
}
public static void speed()
{
  System.out.println("running car please speed");
  horn();//invoke static method horn from the same calss Car
}
public static void gear()
{
  System.out.println("running car please gear");
  axilator();
}
public static void clutch()
{
  System.out.println("running car please press clutch");
}
public static void axilator()
{
  System.out.println("running car please press axilartor");
  door();
}
public static void indicator()
{
  System.out.println("running car please press indicator");
}
public static void door()
{
  System.out.println("running car please open door");
}
public static void window()
{
  System.out.println("running car please open window");
}
}