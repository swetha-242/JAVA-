class ProjectorRunner
{
	public static void main(String[] args)
	{
		Projector projector=new Projector("samsung");
		projector.weight='M';
		projector.setColor("white");
		projector.display();
		System.out.println("========================");
		
		Projector projector1=new Projector("JIO");
		projector1.weight='S';
		projector1.setColor("blue");
		projector1.display();
		System.out.println("========================");
		
		Projector projector2=new Projector("Airtel");
		projector2.weight='L';
		projector2.setColor("green");
		projector2.display();
		System.out.println("========================");
	}
}