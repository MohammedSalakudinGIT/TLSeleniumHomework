package week3.homeworkday1.org.student;

import week3.homeworkday1.org.department.Department;

public class Student extends Department{
	
	public void studentName()
	{
		System.out.println("I am from derived class. My name is studentName");
	}
	
	public void studentDept()
	{
		System.out.println("I am from derived class. My name is studentDept");
	}
	
	public void studentId()
	{
		System.out.println("I am from derived class. My name is studentId");
	}
	
	
	public static void main(String args[])
	{
		Student st=new Student();
		
		st.collegeName();
		st.collegeCode();
		st.collegeRank();
		st.departmentName();
		st.studentName();
		st.studentDept();
		st.studentId();
		
	}
	
}
