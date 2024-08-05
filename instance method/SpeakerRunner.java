class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker("samsung");//invoking the parameterized constructor
		speaker.cost=3200;//reference
		speaker.setSize(34);//instance method or non static method invoking
		speaker.display();
		System.out.println("========================");
		
		Speaker speaker1=new Speaker("airtel");
		speaker1.cost=5600;
		speaker1.setSize(50);
		speaker1.display();
		System.out.println("========================");
		
		Speaker speaker2=new Speaker("finolico");
		speaker2.cost=2490;
		speaker2.setSize(20);
		speaker2.display();
		
	}
}