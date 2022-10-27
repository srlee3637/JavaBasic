package day10;

import java.util.Scanner;

public class MethodEx02 {

	public static void main(String[] args) {

		/*
		 * 매개변수(parameter)
		 * 1. 매개변수는 메서드를 호출 할 때 필요한 값을 전달하는 매개체
		 * 2. 매개변수는 몇 개 받을 지 메서드를 선언 할 때 결정해 준다.
		 */
		
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		
		int ans = calSum(N);
		System.out.println("1~" + N + "까지합:" +ans);
		
		int result = calSum(10);
		System.out.println("1~10까지합:" + result);
		
		int result2 = calSum(100);
		System.out.println("1~100까지합:" + result2);
		
		
		//calSum2();
		int result3 = calSum2(10,20);
		System.out.println("10~20까지합:" + result3);
		
		int result4 = calSum2(2,100);
		System.out.println("1~100까지합:" + result4);
		
		scan.close();
	}
	
	
	//반환o, 매개변수o - 매개변수 하나
	static int calSum(int end){ //타입 + 변수명 
		int sum = 0;
		for(int i = 1; i <= end; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	//반환o, 매개변수o, 매개변수가 여러개

	static int calSum2(int start, int end) {
		int sum =0;
		for(int i = start; i <= end; i++) {
			sum += i;
		}
		return sum;
	}
}
