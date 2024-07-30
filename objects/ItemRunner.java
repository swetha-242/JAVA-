class ItemRunner
{
	public static void main(String[] args)
	{
	   Rupee rupee=new Rupee();
	   int coin=rupee.coin;
	   System.out.println("the coin default value is:"+coin);
	   String noteName=rupee.noteName;
	   System.out.println("the noteName default value is:"+noteName);
	   double price=rupee.price;
	   System.out.println("the price default value is:"+price);
	   System.out.println("===============================");
	   
	   AirCondition airCondition=new AirCondition();
	   String acColor=airCondition.acColor;
	   System.out.println("the acColor default value is:"+acColor);
	   String acName=airCondition.acName;
	   System.out.println("the acName default value is:"+acName);
	   double price1=airCondition.price;
	   System.out.println("the price default value is:"+price1);
	   System.out.println("===============================");
	   
	   AutoRikshaw autoRikshaw=new AutoRikshaw();
	   String name=autoRikshaw.name;
	   System.out.println("the name default value is:"+name);
	   int age=autoRikshaw.age;
	   System.out.println("the age default value is:"+age);
	   long number=autoRikshaw.number;
	   System.out.println("the number default value is:"+number);
	   System.out.println("===============================");
	   
	   AutoDriver autoDriver=new AutoDriver();
	   String autoname=autoDriver.autoname;
	   System.out.println("the name default value is:"+autoname);
	   String driverName=autoDriver.driverName;
	   System.out.println("the driverName default value is:"+driverName);
	   double autonumber=autoDriver.autonumber;
	   System.out.println("the autonumber default value is:"+autonumber);
	   System.out.println("===============================");
	   
	   Rapido rapido=new Rapido();
	   String name1=rapido.name1;
	   System.out.println("the name default value is:"+name1);
	   String driverName1=rapido.driverName1;
	   System.out.println("the driverName default value is:"+driverName1);
	   double number1=rapido.number1;
	   System.out.println("the autonumber default value is:"+number1);
	   System.out.println("===============================");
	  
	   CabCompany cabCompany=new CabCompany();
	   String carName=cabCompany.carName;
	   System.out.println("the name default value is:"+carName);
	   double carPrice=cabCompany.carPrice;
	   System.out.println("the driverName default value is:"+carPrice);
	   String driverName2=cabCompany.driverName2;
	   System.out.println("the autonumber default value is:"+driverName2);
	   System.out.println("===============================");
	   
	   BMTC bMTC=new BMTC();
	   String busName=bMTC.busName;
	   System.out.println("the name default value is:"+busName);
	   double busPrice=bMTC.busPrice;
	   System.out.println("the driverName default value is:"+busPrice);
	   String destination=bMTC.destination;
	   System.out.println("the autonumber default value is:"+destination);
	   System.out.println("===============================");
	   
	   FoodDeliveryCompany foodDeliveryCompany=new FoodDeliveryCompany();
	   String menu=foodDeliveryCompany.menu;
	   System.out.println("the name default value is:"+menu);
	   String foodName=foodDeliveryCompany.foodName;
	   System.out.println("the driverName default value is:"+foodName);
	   int foodPrice=foodDeliveryCompany.foodPrice;
	   System.out.println("the autonumber default value is:"+foodPrice);
	   System.out.println("===============================");
	}
}