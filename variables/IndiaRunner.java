class IndiaRunner
{
  public static void main(String[] args)
{
  System.out.println("the india contains country are:");
  String ref=India.country(577201);
  System.out.println("the country is:"+ref);
  
  String ref1=India.country(534251);
  System.out.println("the country is:"+ref1);
  
  String ref2=India.country(577202);
  System.out.println("the country is:"+ref2);
  
  String ref3=India.country(577435);
  System.out.println("the country is:"+ref3);
  
  String ref4=India.country(643789);
  System.out.println("the country is:"+ref4);
  
  System.out.println("*************************************");
  
  double reff=India.price("palav");
  System.out.println("the item price is:"+reff);
  
  double reff1=India.price("Pav Bajji");
  System.out.println("the item price is:"+reff1);
  
  double reff2=India.price("Masala Dosa");
  System.out.println("the item price is:"+reff2);
  
  double reff3=India.price("Egg Biriyani");
  System.out.println("the item price is:"+reff3);
  
  double reff4=India.price("kulcha");
  System.out.println("the item price is:"+reff4);
  
  System.out.println("*************************************");
  
  String re=India.producerName("Milana");
  System.out.println("the producerName is:"+re);
  
  String re1=India.producerName("ABCD");
  System.out.println("the producerName is:"+re1);
  
  String re2=India.producerName("Student of the year");
  System.out.println("the producerName is:"+re2);
  
  String re3=India.producerName("3 idiots");
  System.out.println("the producerName is:"+re3);
  
  String re4=India.producerName("gooli");
  System.out.println("the producerName is:"+re4);
}
}