package week3.day1.inheritance.student;

public class Students {
	
	public void getStudentInfo(int a)
	{
		System.out.println("My ID is : " +a);
	}
	
	public void getStudentInfo(String name)
	{
		System.out.println("My name is : " +name);
	}
	
	public void getStudentInfo(int a, String b)
	{
		System.out.println("My mail ID is : " +b);
	}
	
	public void getStudentInfo(int a, long b)
	{
		System.out.println("My mobile numnber is : " +b);
	}
	

	public static void main(String[] args)
	{
		Students info1 = new Students();
		info1.getStudentInfo(1414143);
		info1.getStudentInfo("Swatish");
		info1.getStudentInfo(1414143,"swatishkrishnan@gmail.com");
		info1.getStudentInfo(1,8015235946l);

		
	}

}
