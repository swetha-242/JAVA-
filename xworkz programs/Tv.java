class Tv
{
public static void song()
{
System.out.println("it plays a different songs");
}
public static void news()
{
System.out.println("give different news");
}
public static void cricket()
{
System.out.println("it plays a different cricket");
}
public static void kids()
{
System.out.println("it plays a differen kids show");
serial();//it shows the stack overflow for both serial and kids method name 
}
public static void serial()
{
System.out.println("it plays a different serial for enjoyment");
kids();//stack means memory ,,stack overflow means it fill the output until the memory is full after it filss it will stop execution
}
}