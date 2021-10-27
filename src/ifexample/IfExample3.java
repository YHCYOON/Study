package ifexample;

import java.util.Scanner;

public class IfExample3 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if(score <= 59) {
			System.out.println("점수는 "+score+"점 이고 학점은 F 입니다");
		}else if(score <= 69) {
			System.out.println("점수는 "+score+"점 이고 학점은 D 입니다");
		}else if(score <= 79) {
			System.out.println("점수는 "+score+"점 이고 학점은 C 입니다");
		}else if(score <= 89) {
			System.out.println("점수는 "+score+"점 이고 학점은 B 입니다");
		}else if(score <= 100) {
			System.out.println("점수는 "+score+"점 이고 학점은 A 입니다");
		}else {
			System.out.println("점수를 제대로 입력해주세요!!!");
		}
	}

}
