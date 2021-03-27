package week3.day1.inheritance.student;

import week3.day1.inheritance.department.Department;

public class Student extends Department {

	public void studentName()
	{
		System.out.println("My name is Swatish");
	}
	
	public void studentDept()
	{
		System.out.println("My Department is ECE");
	}
	
	public void studentId()
	{
		System.out.println("My ID is 1414143");
	}
	
	public static void main(String[] args) {

		Student find = new Student();
		find.collegeCode();
		find.collegeName();
		find.collegeRank();
		find.deptName();
		find.studentName();
		find.studentId();
		find.studentDept();
	}

}

