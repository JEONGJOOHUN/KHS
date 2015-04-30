package net.hb.day28;

public class Seven {
	public static void main(String[] args) {  //74페이지
		System.out.println("Seven.java");
			int a=3, b=6;
			// 10진수 3 = 2진수는 0000 0011
			// 10진수 6 = 2진수는 0000 0110
			
			int c = a & b;
			int d = a | b;
			int e = a ^ b;
			
			System.out.println(a + "&" + b + "=" + c); //2
			System.out.println(a + "|" + b + "=" + d); //7
			System.out.println(a + "^" + b + "=" + e); //5
			

	}//main end
}//class end
