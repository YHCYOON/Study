package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("안녕하세요11", "세베라");
		library[1] = new Book("안녕하세요22", "세베라");
		library[2] = new Book("안녕하세요33", "세베라");
		library[3] = new Book("안녕하세요44", "세베라");
		library[4] = new Book("안녕하세요55", "세베라");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);		// 객체의 주소를 복사
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("안뇽하세요");
		library[0].setAuthor("토레타");
		
		for( Book book : library) {
			book.showBookInfo();
		}
	}

}
