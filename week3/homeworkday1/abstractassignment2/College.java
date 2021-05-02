package week3.homeworkday1.abstractassignment2;

public class College extends University {
	
	@Override
	public void ug() {
		
		System.out.println("I am UG from derived class of Abstract");
		
	}

	public static void main(String[] args) {
		
		College cg=new College();
		cg.pg();
		cg.ug();

	}

	

}
