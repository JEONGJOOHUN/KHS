package net.hb.day28;

public class Three {
	public static void main(String[] args) {
		System.out.println("Three.java");

		//���� ���� ���� ==> ���׽�
		//���� = ���� ==> ������ �� �ϳ��� ����
		
		int a=4, b=4;
		int sum1=0, sum2=0;
		int sum3=0, sum4=0;
	
		sum1 = ++a + 5 ; // ++������ a�� ������ 1�� ���� (���� �ϰ� ���� ����)
		sum2 = b++ + 5 ; // ++������ b�� ������ 1�� ���� (���� �ϰ� ���� ����)
		sum3 = --a + 3;
		sum4 = b-- + 3;
		
		System.out.println("a=" + a + "\tsum1=" + sum1);	
		System.out.println("b=" + b + "\tsum2=" + sum2);	
		System.out.println("a=" + a + "\tsum3=" + sum3);	
		System.out.println("b=" + b + "\tsum4=" + sum4);	
		
	}//main end
}//class end
