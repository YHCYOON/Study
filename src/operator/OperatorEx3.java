package operator;

public class OperatorEx3 {

	public static void main(String[] args) {

		int score = 100;
		
		System.out.println(++score);	// ++ 연산을 하고 문장 실행
		System.out.println(score++);	// 문장 실행 이후에 ++ 연산
		System.out.println(score);
		
		System.out.println(score--);
		System.out.println(--score);
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ((num1 = num1 + 10) < 10) && ((i = i +2) < 10);
		boolean value2 = ((num1 = num1 + 10) < 10) || ((i = i +2) < 10);
		System.out.println(value);
		System.out.println(value2);
		
		int num2 = 10;
		int num3 = 20;
		int max = (num2 > num3)?num2:num3;
		System.out.println(max);
	}

}
