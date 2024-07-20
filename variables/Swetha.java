//this is the program where in the execution we have to give the input for the details given in program 
//for example--  javac Swetha.java
//               java Swetha rohith rohith@gmail.com 23 Rohith1234
class Swetha
{
	public static void main(String[] person)
	{
      System.out.println("the person details are:");
	  if(person.length==4)
	  {
	    String name=person[0];
		System.out.println("the person name is:"+name);
		String email=person[1];
		System.out.println("the person email is:"+email);
		String age=person[2];
		System.out.println("the person age is:"+age);
		String password=person[3];
		System.out.println("the person password is:"+password);
	  }
	  else
	  {
		  System.out.println("the person details are not found");
	  }
	}
}