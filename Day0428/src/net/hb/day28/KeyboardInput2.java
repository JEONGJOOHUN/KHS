package net.hb.day28;

import java.util.Scanner;

public class KeyboardInput2 {
	public static void main(String[] args) {
		System.out.println("KeyboardInput2.java");
		
		Scanner stdIn = new Scanner (System.in);
		System.out.print("�̸��� ����, �����Ը� ����(space)���� �����Ͽ� �Է� : " );
		
		String name = stdIn.next();
		int i = stdIn.nextInt();
		double d = stdIn.nextDouble();
		
		System.out.println(name +"���� ���̴�"+i+"���̰�");
		System.out.println("�����Դ� " + d + "Kg �Դϴ�.");
		
		
		
	}//main end
}//class end