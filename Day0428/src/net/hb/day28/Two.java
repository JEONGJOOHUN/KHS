package net.hb.day28;

import java.util.Scanner;

public class Two {
	public static void main(String[] args) {
		System.out.println("Two.java");
		int age ; // 선언
		age = 1; // 값 대입 = 할등 = assignment
		
		Scanner stdIn= new Scanner(System.in);
		System.out.print("나이입력? ");
		age=stdIn.nextInt(); // 반드시 정수형 입력
		
		System.out.println("나이=" + age);		
		System.out.println("\n영수증 출력 10:31");
		
		stdIn.close();//추천
		
	}//main end
}//class end
