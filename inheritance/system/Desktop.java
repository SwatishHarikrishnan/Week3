package week3.day1.inheritance.system;

public class Desktop extends Computer 
{
	public void desktopSize()
	{
		System.out.println("depends on brand");
	}

	public static void main(String[] args) {
		Desktop input = new Desktop();	
		input.computerModel();
		input.desktopSize();
	}

}
