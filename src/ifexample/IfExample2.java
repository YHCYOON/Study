package ifexample;

import java.util.Scanner;

public class IfExample2 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		}else if(age < 14) {
			charge = 2000;
		}else if(age < 20) {
			charge = 3000;
		}else {
			charge = 4000;
		}
		
		System.out.println("���̴� "+age+"��");
		System.out.println("����� "+charge+"�� �Դϴ�");
	}

}
