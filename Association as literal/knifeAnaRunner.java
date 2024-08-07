class knifeAnaRunner
{
	public static void main(String[] args)
	{
		System.out.println("started in knifeana runner");
		
		Knife knife=new Knife(230,30);
		Ananya ananya=new Ananya("MOTO",knife);
		ananya.details();
		System.out.println("stopped in knifeana runner");
	}
}