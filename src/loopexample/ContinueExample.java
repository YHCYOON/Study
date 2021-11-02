package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int i;
		for(i = 1; i <= 100; i++) {
			
			if( (i % 3) != 0) continue;	// 3의 배수가 아니면 나감
			System.out.println(i);
		}
	}

}
