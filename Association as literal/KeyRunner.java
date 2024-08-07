class KeyRunner
{
	public static void main(String[] args)
	{
		System.out.println("Started in keybunch runner");
		
		Key key=new Key("Epson",30);
		KeyBunch keyBunch=new KeyBunch("Steel",key);
		keyBunch.details();
		System.out.println("stopped in keybunch runner");
	}
}