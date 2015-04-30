package net.hb.day30;
public class Fisrt {
	public static void main(String[] args) {
		System.out.println("First.java");
		System.out.println("kim hong shik");
		double rate = 78.9;
		int kor=85;                            // int kor 인 경우 초기값이 없지만, 이후에 할당하면 OK
		final double PI = 3.1415;
		final int SIZE = 20;
		final String com = "SM회사";            
		
		rate=12.3;  
		kor=45;                                // 변수(Variable)는 값이 변경 가능. 
																					 // 클래스 앞에 final class String { } 하면 앞으로 상속하지 못함.
		/*
		PI= 6.7;
		SIZE=100;
		com="한빛ENI교육센타";
		*/                                     // 상수는 값 변경하면 에러 발생

		System.out.println("국어=" + kor);
		System.out.println("크기=" + SIZE);

	} //main end
} //class END
