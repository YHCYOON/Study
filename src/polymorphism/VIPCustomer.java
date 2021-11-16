package polymorphism;

public class VIPCustomer extends Customer {

	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		
		super(); // ���� Ŭ������ ����Ʈ �����ڰ� ȣ�� (���������� �ܰ迡�� super�� ��)
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}

	@Override
	public int calcPrice(int price) {

		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
	
}
