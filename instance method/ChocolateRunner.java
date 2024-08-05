class ChocolateRunner
{
	public static void main(String[] args)
	{
		Chocolate chocolate=new Chocolate(40);
		chocolate.size='M';
		chocolate.setFlavour("vanilla");
		chocolate.display();
		System.out.println("========================");
		
		Chocolate chocolate1=new Chocolate(55);
		chocolate1.size='S';
		chocolate1.setFlavour("strwaberry");
		chocolate1.display();
		System.out.println("========================");
		
		Chocolate chocolate2=new Chocolate(80);
		chocolate2.size='L';
		chocolate2.setFlavour("pista");
		chocolate2.display();
		System.out.println("========================");
	}
}