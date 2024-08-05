class RockettRunner
{
	public static void main(String[] args)
	{
		Rockett rockett=new Rockett(370);
		rockett.noOfThurusters=278;
		rockett.setfuelaCapacity("full");
		rockett.display();
		System.out.println("========================");
		
		Rockett rockett1=new Rockett(460);
		rockett1.noOfThurusters=456;
		rockett1.setfuelaCapacity("medium");
		rockett1.display();
		System.out.println("========================");
		
		Rockett rockett2=new Rockett(220);
		rockett2.noOfThurusters=987;
		rockett2.setfuelaCapacity("nill");
		rockett2.display();
		System.out.println("========================");
	}
}