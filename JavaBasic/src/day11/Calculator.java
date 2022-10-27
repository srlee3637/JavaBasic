package day11;

public class Calculator {

	int result; //멤버 변수, field라고 불림 클래스 바로 안에서 사용되는 변수

	int add(int n) {//메서드 대량 생산틀의 기능
		result += n;
		return result;
	}

}
