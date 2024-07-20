class Student
{
   public static void pass(String branch,String subject)
    {
       System.out.println("the student containing the details are");
	   System.out.println("Branch"+"-"+branch);
	   System.out.println("Subject"+"-"+subject);
    }
	
	public static void pass(String branch,String subject,double passedStudents)
	{
	   System.out.println("the student  containing the details are");
	   System.out.println("Branch"+"-"+branch);
	   System.out.println("Subject"+"-"+subject);
	   System.out.println("PassedStudents"+"-"+passedStudents);
	}
	
	public static void pass(String branch,String subject,double passedStudents,int averageScore)
	{
	   System.out.println("the student containing the details are");  
	   System.out.println("Branch"+"-"+branch);
	   System.out.println("Subject"+"-"+subject);
	   System.out.println("PassedStudents"+"-"+passedStudents);
	   System.out.println("AverageScore"+"-"+averageScore);
	}
	
	public static void fail(String subject)
	{
	   System.out.println("the student containing the details of cancel are");
       System.out.println("Subject"+"-"+subject);	 	   
	}
	
	public static void fail(String branch,double failedStudents)
    {
       System.out.println("the student containing the details of cancel are");
	   System.out.println("Branch"+"-"+branch);
	   System.out.println("FailedStudents"+"-"+failedStudents);
    }

	public static void main(String[] args)
	{
		System.out.println("the parameters passed to all values if train");
		Student.pass("CSE","Data Structure");
		Student.pass("ME","Design",2670);
		Student.pass("EEE","Electric Survey",528,150);
		Student.fail("ECE");
		Student.fail("ECE",684);
	}
}