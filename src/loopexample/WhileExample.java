package loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {

		/*
		int num = 1;
		int sum = 0;
		
		while( num <= 10) {
			sum += num;
			num++;		// num 이 11 되는순간 빠져나옴
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
			System.out.println("sum 값은 " + sum + " 입니다");
			num = scanner.nextInt();
			
		}
		System.out.println("num 값이 0입니다. 종료!!!!!");
	}

}
