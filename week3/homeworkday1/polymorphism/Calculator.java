package week3.homeworkday1.polymorphism;

public class Calculator {

	public void add(int a,int b) {
		System.out.println("Add with two args");
		System.out.println(a+b);
	}
	
	
	public void add(int a,int b,int c) {
		System.out.println("Add with three args");
		System.out.println(a+b+c);
	}
	
	
	public void mul(int a,int b) {
		System.out.println("Mul with two args");
		System.out.println(a*b);
	}
	
	public void mul(int a,double b) {
		System.out.println("Mul with int and double");
		System.out.println(a*b);
	}
	
	
	public void sub(int a,int b) {
		System.out.println("Sub with two int args");
		System.out.println(a-b);
	}
	
	public void sub(double a,double b) {
		System.out.println("Sub with two double args");
		System.out.println(a-b);
	}

	public void div(int a,int b) {
		System.out.println("div with two int args");
		System.out.println(a/b);
	}
	
	
	public void div(double a,int b) {
		System.out.println("div with double by int args");
		System.out.println(a/b);
	}

	public static void main(String args[]) {

		Calculator cal = new Calculator();
		cal.add(10,20);
		cal.add(10,20,30);
		cal.mul(10,10);	
		cal.mul(10,36.25d);
		cal.sub(20,10);		
		cal.sub(20.90d,10.50d);
		cal.div(24,2);
		cal.div(24.24d,2);

	}

}
