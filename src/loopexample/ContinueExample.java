package loopexample;

public class ContinueExample {

	public static void main(String[] args) {

		int i;
		for(i = 1; i <= 100; i++) {
			
			if( (i % 3) != 0) continue;	// 3�� ����� �ƴϸ� ����
			System.out.println(i);
		}
	}

}
