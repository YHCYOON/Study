package inheritance;

public class OverrideingTest {

	public static void main(String[] args) {


		Customer customerLee = new Customer();
		customerLee.setCustomerName("�̼���");
		customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		System.out.println("-----------");
		
		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("������");
		customerKim.setCustomerID(10020);
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
		
		System.out.println("-----------");
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + ". ���� �ݾ��� " + priceLee + "�� �Դϴ�");
		System.out.println(customerKim.showCustomerInfo() + ". ���� �ݾ��� " + priceKim + "�� �Դϴ�");
		
		Customer customerNo = new VIPCustomer();
		customerNo.setCustomerName("������");
		customerNo.setCustomerID(10030);
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + ". ���� �ݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�");

	}

}
