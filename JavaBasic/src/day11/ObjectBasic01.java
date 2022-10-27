package day11;

public class ObjectBasic01 {
	//기존의 절차 지향 프로그램 코딩 방법
	public static void main(String[] args) {
		//기존에 사용하던 계산기

		System.out.println("=== 1번 계산기 ===");
		System.out.println(add(5));
		System.out.println(add(10));
		System.out.println(add(100));
		System.out.println("=== 2번 계산기 ===");
		System.out.println(add2(100));
		System.out.println(add2(200));
		
		
		

	}

	//result에 매개값을 저장하는 1번 계산기
	static int result;

	static int add(int n) {
		result += n;
		return result;
	}

	static int result2;

	static int add2(int n) {
		result2 += n;
		return result2;
	}

}
