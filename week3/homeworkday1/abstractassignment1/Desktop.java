package week3.homeworkday1.abstractassignment1;

public class Desktop implements Hardware,Software{

	public void softwareResource() {
		System.out.println("I am software resource");		
	}

	public void hardwareResource() {
		System.out.println("I am hardware resource");		
		
	}
	
	
	public static void main(String args[])
	{
		
		Desktop dp=new Desktop();
		dp.hardwareResource();
		dp.softwareResource();
	}
	
}
