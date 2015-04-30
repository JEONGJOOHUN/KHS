package net.hb.day30;
public class Two {
	public static void main(String[] args) {
			int a=0, b=0, c=0;
			int sum1=0, sum2=0, sum3=0;
			
			for (int i = 1; i < 10; i++) { 							// 조건이 만족하지 않으면 처음에 실행되지 않음. 논리의 error
				a++;
				System.out.print( a + "  ");						
				sum1 += a;															// 대입연산자
			}// for end
			System.out.println("\n합계=" + sum1 );
		
		
		
	} //main end
} //class END
