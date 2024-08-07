class Ganavi
{
	String email;
	Clip clip;
	
	public Ganavi(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
	}
	
	public void details()
	{
		System.out.println("the email is:"+email);
		System.out.println("the Clip start running is");
		this.clip.details();
	}
}