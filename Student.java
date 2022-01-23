package week1.day1;

public class Student {
	String name = "ilaya bharathi" ;
	int rollNo = 14071999;

	public void collegeName(String collegeName) {
		System.out.println("Collage Name: "+collegeName);
	}

	private void college(String dept) {
		System.out.println("Department: "+dept);
	}

	void collegeBusNo(int busNo) {
		System.out.println("Bus Number: "+busNo);
	}

	public static void main(String[] args) {

		Student student = new Student();
		System.out.println("Student Name: "+student.name);
		System.out.println("Roll  Number: "+student.rollNo);
		student.collegeName("NGP");
		student.college("computer science");
		student.collegeBusNo(20);
	}
}

