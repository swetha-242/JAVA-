class PaperRunner
{
	public static void main(String[] args)
	{
		Paper Paper=new Paper(30);
		Paper.quality="good";
		Paper.setColor("white");
		Paper.display();
		System.out.println("========================");
		
		Paper Paper1=new Paper(100);
		Paper1.quality="Average";
		Paper1.setColor("blue");
		Paper1.display();
		System.out.println("========================");
		
		Paper Paper2=new Paper(150);
		Paper2.quality="excellent";
		Paper2.setColor("green");
		Paper2.display();
		System.out.println("========================");
	}
}