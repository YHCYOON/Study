package array;

public class TowDimension {

	public static void main(String[] args) {

		int[][] arr = { {1,2,3}, {4,5,6} };
		
		/*
		System.out.println(arr.length);		// 행의 길이 (개수)
		System.out.println(arr[0].length);		// 첫번쨰 행의 길이
		System.out.println(arr[1].length);		// 두번째 행의 길이
		*/
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
