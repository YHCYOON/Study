package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("안녕하세요1", "세베라1");
		library[1] = new Book("안녕하세요2", "세베라2");
		library[2] = new Book("안녕하세요3", "세베라3");
		library[3] = new Book("안녕하세요4", "세베라4");
		library[4] = new Book("안녕하세요5", "세베라5");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
