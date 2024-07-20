class Chainn
{
   public static boolean carat()
   {
	  boolean carat=true;
	  return carat;
   }
   public static double costPerGram()
   {
	  double costPerGram=25000;
	  return costPerGram;
   }
   public static String type()
   {
	  String type="Good Quality";
	  return type;
   }
   public static boolean quality()
   {
	  boolean quality=false;
	  return quality;
   }
   public static int quantity()
   {
	  int quantity=34;
	  return quantity;
   }
   public static double wastage()
   {
	  double wastage=3400;
	  return wastage;
   }
   public static double serviceCharge()
   {
	  double serviceCharge=5000;
	  return serviceCharge;
   }
   public static int gst()
   {
	  int gst=3456;
	  return gst;
   }
   
   public static void main(String[] args)
   {
     System.out.println("The blood details are:");
	 boolean got=Chainn.carat();
	 System.out.println("carat runs in the group:"+got);
	 double cost=Chainn.costPerGram();
	 System.out.println("costPerGram runs in the group:"+cost);
	 String its=Chainn.type();
	 System.out.println("type runs in the group:"+its);
	 boolean isHe=Chainn.quality();
	 System.out.println("quality runs in the group:"+isHe);
	 int had=Chainn.quantity();
	 System.out.println("quantity runs in the group:"+had);
	 double fine=Chainn.wastage();
	 System.out.println("wastage runs in the group:"+fine);
	 double get=Chainn.serviceCharge();
	 System.out.println("serviceCharge runs in the group:"+get);
	 int contain=Chainn.gst();
	 System.out.println("wastage runs in the group:"+contain);
   }
}