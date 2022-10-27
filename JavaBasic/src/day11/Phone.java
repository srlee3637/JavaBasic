package day11;

public class Phone {

	String model;
	int price;
	String color;
	
    //생성자 - 
    //1. 클래스가 객체로 처음 생성 될 때 불려나가는 친구
    //2. 이름은 클래스 명과 동일
	//3. 생성지를 민들지 않으면 자동으로 생성해줌 
	//4. 객체가 만들어질 때 가장 먼저 호출이 된다.
	//5. 주된 역할은 초기값 지정
	//6. 생성자는 여러개 생성 가능
	Phone(){//제일 많이 사용
		System.out.println("생성자 호출됨");
		model = "애니콜";
		price = 1000;
		color = "red";
	}
	
	Phone(String pModel){
		System.out.println("생성자 호출됨");
		model = pModel;
		price = 2000;
		color = "blue";
	}
	
	Phone(String pModel, int pPrice){
		System.out.println("생성자 호출됨");
		model = pModel;
		price = pPrice;
		color = "black";
	}
	
	Phone(int pPrice, String pModel){
		System.out.println("생성자 호출됨");
		model = pModel;
		price = pPrice;
		color = "white";
	}
	
	

	Phone(String pModel, int pPrice, String pColor){//두번째로 많이 사용
		System.out.println("생성자 호출됨");
		model = pModel;
		price = pPrice;
		color = pColor;
	}
	
	void info() {
		System.out.println("=== 폰의 정보 ===");
		System.out.println("모델:" + model);
		System.out.println("가격:" + price);
		System.out.println("색상:" + color);
		System.out.println();
	}
}
