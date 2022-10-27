package day11;

public class ObjectBasic02 {
	//OOP 객체지향 프로그램 코딩방식 
	public static void main(String[] args) {

		
		System.out.println("===1번 계산기===");
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(1));
		System.out.println(cal.add(2));
		System.out.println(cal.add(3));
		
		System.out.println("===1번 계산기===");
		Calculator cal2 = new Calculator();
	
		System.out.println(cal2.add(10));
		System.out.println(cal2.add(31));
		System.out.println(cal2.add(142));

	}

}
