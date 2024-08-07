class ClipGanRunner
{
	public static void main(String[] args)
	{
		System.out.println("Started in runner");
		
		Clip clip=new Clip("banana clip",true);
		Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
		ganavi.details();
		System.out.println("stopped in runner");
	}
}