package object;

class Student{
	int studentNum;
	String studentName;
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student std = (Student)obj;
			return (this.studentNum == std.studentNum);
		}
		return false;
	}

	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
	
	
}

public class EqualsTest {

	public static void main(String[] args) {

		Student Lee = new Student(100, "�̼���");
		Student Lee2 = Lee;
		Student Shin = new Student(100, "�̼���");
		
		System.out.println(Lee == Lee2);	// ���������� ����
		System.out.println(Lee == Shin);	// ���������� �ٸ�
		
		System.out.println(Lee.equals(Shin)); 
		
		System.out.println(Shin.hashCode());
		
		// ���������� �����Ϸ��� �������� �����ϰ�( equals()�� true ) hashCode() ���� ���ƾߵ�
		
		
		Integer i1 = 100;
		Integer i2 = 100;
		Integer i3 = new Integer(100);
		Integer i4 = new Integer(100);
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		System.out.println(System.identityHashCode(i3));
		System.out.println(System.identityHashCode(i4));
	}
	

}
