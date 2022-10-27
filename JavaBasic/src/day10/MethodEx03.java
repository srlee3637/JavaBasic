package day10;

public class MethodEx03 {

	public static void main(String[] args) {

		/*
		 * 반환유형(return type)
		 * 1. 반환유형은 메서드가 돌려주는 값에 대한 타입
		 */

		//int result = add(3,5);
		//System.out.println(result);
		//System.out.println(add(3,5));
		int result = add( add(1, 2), add(2, 3));
		System.out.println(result);

		//int r = sub(1, 2);
		//System.out.println(sub(1, 2));
		sub(1, 2);//값을 돌려 받는게 아니라서 호출만 가능하다
		noReturn("hello");
		noReturn("hi");
		
	}

	//반환o , 매개변수o
	static int add(int a, int b) {
		return a + b;
	}

	//반환x, 매개변수o void인 경우는 실행만 하고 끝, 값을 반환하는게 아니라 실행만 한다. 리턴이 없음(단순 실행)
	static void sub(int a, int b) {
		System.out.println("a-b=" + (a-b));
	}
	
	//void 형에서 return- 종료
	static void noReturn(String s) {
		
		if(s.equals("hello")) {
			System.out.println("실행종료");
			return ; //종료
		}
		
		System.out.println(s);
	}

}
