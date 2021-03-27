package week3.day1.abstractclass;

public abstract class College implements University 
{

	public void pg() 
	{
		System.out.println("Not interested in PG");
	}

	public abstract void ug();
	
	public static void main(String[] args)
	{
		Postcollege degree = new Postcollege();
		degree.pg();
		degree.ug();
	}
}
