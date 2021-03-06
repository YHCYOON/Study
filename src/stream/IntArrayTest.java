package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int sum = Arrays.stream(arr).sum();	// 한번 생성하면 한번밖에 못씀
		int count = (int)Arrays.stream(arr).count();
		
		System.out.println(sum);
		System.out.println(count);
		
		System.out.println(Arrays.stream(arr).reduce(0, (a,b)->a+b));	// reduce : 직접 연산 정의
		
	}

}
