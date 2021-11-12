package array;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(1001, "Lee");
		
		studentLee.addSubject("국어", 100);
		studentLee.addSubject("영어", 99);
		
		Student studentKim = new Student(1002, "Kim");
		
		studentLee.addSubject("국어", 65);
		studentLee.addSubject("영어", 70);
		studentLee.addSubject("구학", 55);
		
		studentLee.showStudentInfo();
		System.out.println("===============");
		studentKim.showStudentInfo();
	}

}
