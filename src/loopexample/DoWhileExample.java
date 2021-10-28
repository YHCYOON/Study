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
			System.out.println("sum 값은 " + sum +" 입니다");
			
		}while( num != 0 );
		
		System.out.println("num이 0입니다");
	}

}
