package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score <= 59) {
			System.out.println("������ "+score+"�� �̰� ������ F �Դϴ�");
		}else if(score <= 69) {
			System.out.println("������ "+score+"�� �̰� ������ D �Դϴ�");
		}else if(score <= 79) {
			System.out.println("������ "+score+"�� �̰� ������ C �Դϴ�");
		}else if(score <= 89) {
			System.out.println("������ "+score+"�� �̰� ������ B �Դϴ�");
		}else if(score <= 100) {
			System.out.println("������ "+score+"�� �̰� ������ A �Դϴ�");
		}else {
			System.out.println("������ ����� �Է����ּ���!!!");
		}
	}

}
