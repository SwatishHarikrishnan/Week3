package week3.day1.Polymorphism;


public class Calculator
{
	public void add(int a , int b)
	{
		System.out.println("The addition of two integer number is " +(a+b));
	}
	public void add(int a , int b, int c)
	{
		System.out.println("The addition of three integer number is " +(a+b+c));
	}
	public void subtract(int a , int b)
	{
		System.out.println("The subtraction of two integer number is " +(a-b));
	}
	public void subtract(double a, double b)
	{
		System.out.println("The subtraction of two double number is " +(b-a));	
	}
	public void multiply(int a , int b)
	{
		System.out.println("The multiplication of two integer number is " +(a*b));		
	}
	public void multiply(int a , double b)
	{
		System.out.println("The multiplication of integer and double number is " +(a*b));				
	}
	public void divide(int a , int b)
	{
		System.out.println("The division of two integer number is " +(a/b));				
	}
	public void divide(int a , double b)
	{
		System.out.println("The division of integer and double number is " +(a/b));						
	}
	

	public static void main(String[] args)
	{
		Calculator input = new Calculator();
		input.add(15,10);
		input.add(15,10,5);
		input.subtract(15,10);
		input.subtract(15d,10d);
		input.multiply(15,10);
		input.multiply(15,100d);
		input.divide(15,10);
		input.divide(15,100d);
		
	}
}
