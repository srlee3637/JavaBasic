package day11;
import java.util.*;
public class MethodEx05 {

	
	public static void main(String[] args) {

		//메서드의 순서대로(동기적) 실행 
		test01();
		//메서드의 반복(재귀적) 실행
		recursive(0);

		int sum = 1;
		for(int i = 1; i <= 5; i++) {
			sum *= i;
		}
		
		System.out.println(sum);
		
		int f= fac(5);
		System.out.println(f);
	}

	static void test01() {
		System.out.println("1번 메서드 실행");
		test02();
		System.out.println("1번 메서드 종료");
	}
	
	static void test02() {
		System.out.println("2번 메서드 실행");
		System.out.println("2번 메서드 종료");
	}
	
	static void recursive(int a) {
		//재귀적 함수는 탈출의 구문은 반드시 명시해주는게 규칙이다. 
		if(a==10) return;
		
		System.out.println(a + "번 호출");
		
		a++; //1 증가
		recursive(a);
	}
	
	static int fac(int a) {
		
		if(a==1) return 1;
			
		return a * fac(a-1);
		
	}
	
}
