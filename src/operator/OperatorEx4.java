package operator;

public class OperatorEx4 {

	public static void main(String[] args) {

		int num1 = 0b00001010;	//10;
		int num2 = 0b00000101;	//5;
		
		System.out.println(num1 & num2);	// ��Ʈ�� �Ѵ� 1�϶��� 1
		System.out.println(num1 | num2);		// ��Ʈ�� �Ѵ� 0�ϋ��� 0
		System.out.println(num1 ^ num2);	// ��Ʈ�� �޶�� 1
		
		System.out.println(num2 <<= 3);
		System.out.println(num2);
	}

}
