class Aeroplane
{
	String company;
	int noOfSeats;
	double ticketPrice;
	String source;
	String destination;
	
	Aeroplane()
	{
		
	}
	
	Aeroplane(String company,int noOfSeats,double ticketPrice,String source,String destination)
	{
		this.company=company;
		this.noOfSeats=noOfSeats;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("the Aeroplane least is created:");
		
	}
	
	Aeroplane(String company,String source,String destination)
	{
		this.company=company;
		this.source=source;
		this.destination=destination;
		System.out.println("the Aeroplane least is created:");
		
	}
	
	Aeroplane(String company,double ticketPrice,String source,String destination)
	{
		this.company=company;
		this.ticketPrice=ticketPrice;
		this.source=source;
		this.destination=destination;
		System.out.println("the Aeroplane least is created:");
		
	}
}