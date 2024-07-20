class HospitalRunner
{
  public static void main(String[] args)
{
  System.out.println("the Hospial contains details are:");
  double ref=Hospital.price("DOLO");
  System.out.println("the price is:"+ref);
  
  double ref1=Hospital.price("Paracetamol");
  System.out.println("the price is:"+ref1);
  
  double ref2=Hospital.price("Glycoxyy");
  System.out.println("the price is:"+ref2);
  
  System.out.println("*************************************");
  
  String reff=Hospital.medicineName("High Fever");
  System.out.println("the medicineName is:"+reff);
  
  String reff1=Hospital.medicineName("Eye Pain");
  System.out.println("the medicineName is:"+reff1);
  
  String reff2=Hospital.medicineName("Leg scratch");
  System.out.println("the medicineName is:"+reff2);
  
  System.out.println("*************************************");
  
  boolean re=Hospital.availability("shrikanth");
  System.out.println("the availability is:"+re);
  
  boolean re1=Hospital.availability("Nagaraj");
  System.out.println("the availability is:"+re1);
  
  boolean re2=Hospital.availability("Prashanth");
  System.out.println("the availability is:"+re2);
}
}