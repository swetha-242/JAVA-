class WorldRunner
{
	public static void main(String[] args)
	{
	  Charger charger=new Charger();
	  charger.companyName="OPPO A9";
	  charger.price=340;
	  System.out.println("the company name is:"+charger.companyName);
	  System.out.println("the price name is:"+charger.price);
	  System.out.println("the color name is:"+charger.color);
	  System.out.println("===================================");
	  
	  Claw claw=new Claw();
	  claw.companyName1="deer";
	  claw.price1=50;
	  System.out.println("the companyName1 name is:"+claw.companyName1);
	  System.out.println("the price1 name is:"+claw.price1);
	  System.out.println("the color1 name is:"+claw.color1);
	  System.out.println("===================================");
	  
	  Crow crow=new Crow();
	  crow.Name="deer";
	  crow.count=530;
	  System.out.println("the name name is:"+crow.Name);
	  System.out.println("the count name is:"+crow.count);
	  System.out.println("the color2 name is:"+crow.color2);
	  System.out.println("===================================");
	  
	  Clock clock=new Clock();
	  clock.manuName="fastrack";
	  clock.time="4:20PM";
	  System.out.println("the manuName name is:"+clock.manuName);
	  System.out.println("the time name is:"+clock.time);
	  System.out.println("the cost name is:"+clock.cost);
	  System.out.println("===================================");
	  
	  Lollipop lollipop=new Lollipop();
	  lollipop.lolliName="lop lop lop";
	  lollipop.flavor="vannilla";
	  System.out.println("the lolliName name is:"+lollipop.lolliName);
	  System.out.println("the price2 name is:"+lollipop.price);
	  System.out.println("the flavor name is:"+lollipop.flavor);
	  System.out.println("===================================");
	  
	  Jean jean=new Jean();
	  jean.jeanName="lop lop lop";
	  jean.type="vannilla";
	  System.out.println("the jeanName name is:"+jean.jeanName);
	  System.out.println("the price name is:"+jean.jeanprice);
	  System.out.println("the type name is:"+jean.type);
	  System.out.println("===================================");
	  
	  KeyBoard keyBoard=new KeyBoard();
	  keyBoard.lapName="Hp";
	  keyBoard.boardPrice=13000;
	  System.out.println("the lapName name is:"+keyBoard.lapName);
	  System.out.println("the boardPrice name is:"+keyBoard.boardPrice);
	  System.out.println("the working name is:"+keyBoard.working);
	  System.out.println("===================================");
	  
	  Mountain mountain=new Mountain();
	  mountain.location="ladakh";
	  mountain.km=24589;
	  System.out.println("the location name is:"+mountain.location);
	  System.out.println("the km name is:"+mountain.km);
	  System.out.println("the canReach name is:"+mountain.canReach);
	  System.out.println("===================================");
	  
	  Stadium stadium=new Stadium();
	  stadium.name="nehru";
	  stadium.canCount=true;
	  System.out.println("the name name is:"+stadium.name);
	  System.out.println("the canCount name is:"+stadium.canCount);
	  System.out.println("the canReach name is:"+stadium.length);
	  System.out.println("===================================");
	  
	  Spray spray=new Spray();
	  spray.brandname="zen";
	  spray.fragrance="jasmine";
	  System.out.println("the brandname name is:"+spray.brandname);
	  System.out.println("the fragrance name is:"+spray.fragrance);
	  System.out.println("the price3 name is:"+spray.price3);
	  System.out.println("===================================");
	}
}