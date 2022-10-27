package day03;

public class SwitchEx01 {

	public static void main(String[] args) {
		
		int a = -1;
		
		//switch 구문의 ()에는 값이나 값에 대한 연산식이 들어갈 수 있다.
		//if가 조건을 적는다면, switch는 값을 넣는다.
		switch (a) {
		
		case -1:
		case 0:
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다");
			break;
		case 3:
			System.out.println("3입니다");
			break;
		case 4:
			System.out.println("4입니다");
			break;
		default:
			System.out.println("1~4가 아닙니다");
			break;
		}
	}

}
