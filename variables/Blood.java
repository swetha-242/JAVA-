class Blood
{
   public static boolean group()
   {
	  boolean group=true;
	  return group;
   }
   public static String personName()
   {
	  String personName="Mahanthesh";
	  return personName;
   }
   public static double cost()
   {
	  double cost=1000;
	  return cost;
   }
   public static boolean hospitaltested()
   {
	  boolean hospitaltested=false;
	  return hospitaltested;
   }
   public static boolean sicknessOrNot()
   {
	  boolean sicknessOrNot=true;
	  return sicknessOrNot;
   }
   public static boolean returnOrNot()
   {
	  boolean returnOrNot=false;
	  return returnOrNot;
   }
   public static void main(String[] args)
   {
     System.out.println("The blood details are:");
	 boolean got=Blood.group();//here the got is the new variable that is declared to store the method group in the Blood class 
	 //here the dataype should be same as we given in the group method here in program group method the dataype is boolean
	 System.out.println("personName runs in the group:"+got);
	 String his=Blood.personName();
	 System.out.println("personName runs in the group:"+his);
	 double price=Blood.cost();
	 System.out.println("cost runs in the group:"+price);
	 boolean isHe=Blood.hospitaltested();
	 System.out.println("hospitaltested runs in the group:"+isHe);
	 boolean had=Blood.sicknessOrNot();
	 System.out.println("sicknessOrNot runs in the group:"+had);
	 boolean fine=Blood.returnOrNot();
	 System.out.println("returnOrNot runs in the group:"+fine);
   }
}