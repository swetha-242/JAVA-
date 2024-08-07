class KeyBunch
{
	String material;
	Key key;
	
	public KeyBunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
	}
	
	public void details()
	{
		System.out.println("the material is:"+material);
		System.out.println("the key start running is");
		this.key.details();
	}
}