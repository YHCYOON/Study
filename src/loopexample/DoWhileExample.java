package loopexample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int num;
		int sum = 0;
		
		do {
			num = scanner.nextInt();
			sum += num;
			System.out.println("sum ���� " + sum +" �Դϴ�");
			
		}while( num != 0 );
		
		System.out.println("num�� 0�Դϴ�");
	}

}
