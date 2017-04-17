package test;

public class cStudent {
	
	private String name;
	private static int count = 0;
	private int id;
	
	public cStudent(String givenName)
	{
		name = givenName;
		id = count++;
	}
	
	public int getStudentId()
	{
		return id;
	}
	
	public String getStudentName()
	{
		return name;
	}
}
