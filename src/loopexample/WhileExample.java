package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		/*
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			sum += num;
			num++;		// num �� 11 �Ǵ¼��� ��������
		}
		
		System.out.println(sum);
		System.out.println(num);
		*/
		
		Scanner scanner = new Scanner(System.in);
		int num;
		int sum = 0;
		num = scanner.nextInt();
		
		while(num != 0) {
			sum += num;
			System.out.println("sum ���� " + sum + " �Դϴ�");
			num = scanner.nextInt();
			
		}
		System.out.println("num ���� 0�Դϴ�. ����!!!!!");
	}

}
