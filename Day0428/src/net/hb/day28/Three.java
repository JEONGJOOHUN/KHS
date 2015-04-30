package net.hb.day28;

public class Three {
	public static void main(String[] args) {
		System.out.println("Three.java");

		//좌항 연산 우항 ==> 이항식
		//단항 = 일항 ==> 연산할 항 하나만 존재
		
		int a=4, b=4;
		int sum1=0, sum2=0;
		int sum3=0, sum4=0;
	
		sum1 = ++a + 5 ; // ++있으면 a는 무조건 1씩 증가 (증분 하고 나서 연산)
		sum2 = b++ + 5 ; // ++있으면 b는 무조건 1씩 증가 (연산 하고 나서 증분)
		sum3 = --a + 3;
		sum4 = b-- + 3;
		
		System.out.println("a=" + a + "\tsum1=" + sum1);	
		System.out.println("b=" + b + "\tsum2=" + sum2);	
		System.out.println("a=" + a + "\tsum3=" + sum3);	
		System.out.println("b=" + b + "\tsum4=" + sum4);	
		
	}//main end
}//class end
