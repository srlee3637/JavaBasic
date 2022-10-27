package day11;

public class Variable {

	//멤버변수: 초기화를 하지 않으면 기본값으로 자동 초기화
	String a;
	//a = 10; 이런 작업은 field에서는 불가능
	
	void printNum(int c) {
		
		int b = 10; //지역 변수는 무조건 초기값이 지정되어야 사용가능 
		System.out.println("멤버:" + a);
		System.out.println("지역:" + b);
		System.out.println("매개:" + c); //매개변수도 지역변수의 일종이다. 
		//하지만 예외적으로 초기값 지정이 되지 않아도 사용 가능
	
	}
	
}
