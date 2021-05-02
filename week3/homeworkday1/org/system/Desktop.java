package week3.homeworkday1.org.system;

public class Desktop extends Computer{
	
	public void desktopSize()
	{
		System.out.println("I am derived class method");
	}
	
	
	public static void main(String args[])
	{
		
		Desktop dp=new Desktop();
		
		dp.computerModel();
	}
	
	
	}


