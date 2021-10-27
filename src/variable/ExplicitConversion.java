package variable;

public class ExplicitConversion {

	public static void main(String[] args) {

		int i = 1000;
		byte bNum = (byte)i;
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9f;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1);	// 실수를 int로 형변환하면 소수점이 truncate
		System.out.println(iNum2);
	}

}
