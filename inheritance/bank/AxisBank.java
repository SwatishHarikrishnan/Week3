package week3.day1.inheritance.bank;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Deposit is mandatory");
	}

	public static void main(String[] args)
	{
		AxisBank info=new AxisBank();
		info.deposit();
		info.fixed();

	}

}