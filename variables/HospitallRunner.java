class HospitallRunner
{
  public static void main(String[] args)
  {
  System.out.println("the Hospial contains details are:");
  double ref=Hospitall.price("DOLO");
  System.out.println("the price is:"+ref);
  
  boolean reff=Hospitall.price("palav");
  System.out.println("the item price is:"+reff);
  
  Hospitall.color();
  }
}