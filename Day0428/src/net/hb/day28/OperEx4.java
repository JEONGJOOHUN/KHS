package net.hb.day28;

public class OperEx4 {
	public static void main(String[] args) {  //74페이지
		System.out.println("OperEx4.java");
			int a, b;
			a= 10;
			b= 20; 
			
			boolean c = (a>7) && (b>50);
			System.out.println(c); // false

			
			// 관계연산자			
			boolean dap1 = a>b;
			boolean dap2 = a != b;
			boolean dap3 = a==b;  
			System.out.println( a + " > " + b +" 결과는 "+ dap1);
			System.out.println( a + " != " + b + " 결과는 " + dap2);			
			System.out.println( a + " == " + b + " 결과는 " + dap3);
			
	}//main end
}//class end
