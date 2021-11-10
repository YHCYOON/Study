package array;

public class ObjectCopy {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("�ȳ��ϼ���11", "������");
		library[1] = new Book("�ȳ��ϼ���22", "������");
		library[2] = new Book("�ȳ��ϼ���33", "������");
		library[3] = new Book("�ȳ��ϼ���44", "������");
		library[4] = new Book("�ȳ��ϼ���55", "������");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);		// ��ü�� �ּҸ� ����
		
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
		library[0].setTitle("�ȴ��ϼ���");
		library[0].setAuthor("�䷹Ÿ");
		
		for( Book book : library) {
			book.showBookInfo();
		}
	}

}
