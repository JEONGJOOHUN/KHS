package net.hb.day30;
public class Fisrt {
	public static void main(String[] args) {
		System.out.println("First.java");
		System.out.println("kim hong shik");
		double rate = 78.9;
		int kor=85;                            // int kor �� ��� �ʱⰪ�� ������, ���Ŀ� �Ҵ��ϸ� OK
		final double PI = 3.1415;
		final int SIZE = 20;
		final String com = "SMȸ��";            
		
		rate=12.3;  
		kor=45;                                // ����(Variable)�� ���� ���� ����. 
																					 // Ŭ���� �տ� final class String { } �ϸ� ������ ������� ����.
		/*
		PI= 6.7;
		SIZE=100;
		com="�Ѻ�ENI������Ÿ";
		*/                                     // ����� �� �����ϸ� ���� �߻�

		System.out.println("����=" + kor);
		System.out.println("ũ��=" + SIZE);

	} //main end
} //class END
