package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");
		int age ; // ����
		age = 1; // �� ���� = �ҵ� = assignment
		
		Scanner stdIn= new Scanner(System.in);
		System.out.print("�����Է�? ");
		age=stdIn.nextInt(); // �ݵ�� ������ �Է�
		
		System.out.println("����=" + age);		
		System.out.println("\n������ ��� 10:31");
		
		stdIn.close();//��õ
		
	}//main end
}//class end