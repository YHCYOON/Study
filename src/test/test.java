package test;

import java.util.ArrayList;
import java.util.Arrays;

public class test {
	
	int prdNo;
	String prdName;
	int prdPrice;
	int prdYear;
	String prdMaker;
	
	
	
	public static void main(String[] args) {

		String[][] aaa = new String[][] {
			{"001", "��Ʈ��", "1200000", "2021", "�Ｚ" },
			{"002", "�����", "300000", "2021", "LG" },
			{"003", "���콺", "30000", "2020", "������" }
		};
		
		
		System.out.printf("%4s %4s\t %s\t %4s\t %3s \n", "��ǰ��ȣ", "��ǰ��", "����", "����", "������");
		System.out.println("----------------------------------------");
		for(int i = 0; i < aaa.length; i++) {
				System.out.printf("%4s \t %4s \t %s \t %4s \t %3s \n", aaa[i][0], aaa[i][1], aaa[i][2], aaa[i][3], aaa[i][4]);
		}
	}

}
