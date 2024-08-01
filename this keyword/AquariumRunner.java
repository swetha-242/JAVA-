class AquariumRunner
{
	public static void main(String[] args)
	{
		Aquarium aquarium=new Aquarium("gold",230,"bangda");
		System.out.println("the name is"+aquarium.color);
		System.out.println("the name is"+aquarium.price);
		System.out.println("the name is"+aquarium.brand);
		System.out.println("==================================");
		
		Aquarium aquarium1=new Aquarium();
		System.out.println("the name is"+aquarium1.color);
		System.out.println("the name is"+aquarium1.price);
		System.out.println("the name is"+aquarium1.brand);
		System.out.println("==================================");
		
		Aquarium aquarium2=new Aquarium("silver",230);
		System.out.println("the name is"+aquarium2.color);
		System.out.println("the name is"+aquarium2.price);
		System.out.println("the name is"+aquarium2.brand);
		System.out.println("==================================");
		
		Aquarium aquarium3=new Aquarium("silver");
		System.out.println("the name is"+aquarium3.color);
		System.out.println("the name is"+aquarium3.price);
		System.out.println("the name is"+aquarium3.brand);
	}
}