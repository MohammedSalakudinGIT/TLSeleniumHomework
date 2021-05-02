package week3.homeworkday1.overload;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("I am method having only id as argument");
		System.out.println(id);
	}

	public void getStudentInfo(int id, String name) {
		System.out.println("I am overloaded method having both id and name as argument");
		System.out.println(id);
		System.out.println(name);

	}

	public void getStudentInfo(String email, String phoneNumber) {
		System.out.println("I am overloaded method having both email and phoneNumber as argument");
		System.out.println(email);
		System.out.println(phoneNumber);

	}

	public static void main(String args[]) {

		Students stu = new Students();

		stu.getStudentInfo(1001);
		stu.getStudentInfo(1001, "Sampath");
		stu.getStudentInfo("sam@test.com", "1234567890");

	}

}
