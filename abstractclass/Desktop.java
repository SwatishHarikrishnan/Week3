package week3.day1.abstractclass;

public class Desktop implements HardWare,Software
{

	public void desktopModel()
	{
		System.out.println("The desktop model is latest version");
	}
	
	public void hardwareResources() 
	{
		System.out.println("The resource made of hardware");
	}
	public void softwareResources() 
	{
		System.out.println("The resource made of software");	
	}
	
	public static void main(String[] args) 
	{
		Desktop internal = new Desktop();
		internal.desktopModel();
		internal.hardwareResources();
		internal.softwareResources();
	}

}
