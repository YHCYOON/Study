package array;

public class BookArrayTest {

	public static void main(String[] args) {

		Book[] library = new Book[5];
		
		library[0] = new Book("�ȳ��ϼ���1", "������1");
		library[1] = new Book("�ȳ��ϼ���2", "������2");
		library[2] = new Book("�ȳ��ϼ���3", "������3");
		library[3] = new Book("�ȳ��ϼ���4", "������4");
		library[4] = new Book("�ȳ��ϼ���5", "������5");
		
		for(int i = 0; i < library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
	}

}
