package loopexample;

public class ForExample {

	public static void main(String[] args) {

		int sum = 0;
		
		/*
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		
		System.out.println(sum);
		*/
		
		int count = 1;
		
		for(int i = 0; i < 10; i++) {
			sum += count;
			count++;
		}
		
		System.out.println(sum);
		
	}

}
