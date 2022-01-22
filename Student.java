package week1.day1;

public class Student 
{
	String name = "Rossi";
	int roll_no = 12809;
	
	public void college()
	{
		String college_Name = "Prince College";
		System.out.println("college Name : " +college_Name);
	}
	public static void main(String[] args) 
	{
		System.out.println("***Student Details***");
		Student obj = new Student();
		obj.college();		
		System.out.println("student Name : "+obj.name);
		System.out.println("Roll number  : "+obj.roll_no);
		System.out.println("Group        : +ve");
		System.out.println("Section      : B.sc(Computer Science");
	}
}
