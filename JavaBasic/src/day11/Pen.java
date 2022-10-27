package day11;

//대량 생산을 목적으로 하는 클래스는 메인이 없다.
public class Pen {

	//클래스에서 속성을 나타내는 것을 멤버변수(field)임
	String color; //초기화를 해도 되지만 보통 나중에 설정한다.
	int price =1000; // 변수의 선언만 있다. int price = 10;으로 초기화 해놓고 price = 20;으로 바꿀 수 없음
	String company;
	
	//클래스에서 기능을 나타내는 것은 메서드
	
	void write() {
		
		System.out.println(color + "글씨를 씁니다");
	}
	
	void info() {
		
		System.out.println("=== 펜의 정보 ===");
		System.out.println("색상:" + color);
		System.out.println("가격:" + price);
		System.out.println("제조사:" + company);
	}
	
	
	
}
