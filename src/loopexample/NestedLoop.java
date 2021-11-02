package loopexample;

public class NestedLoop {

	public static void main(String[] args) {

		// dan * count = ?
		
		// for¹®
		/*
		for(int dan = 1; dan < 10; dan++) {
			for(int count = 1; count < 10; count++) {
				System.out.println(dan + " * " + count + " = " + dan*count);
			}
			System.out.println("");
		}
		*/
		
		// while ¹®
		int dan = 1;
		
		while(dan <= 9) {
			int count = 1;
			while(count <= 9) {
				System.out.println(dan + " * " + count + " = " + dan*count);
				count++;
			}
			dan++;
			System.out.println("");
		}
	}

}
