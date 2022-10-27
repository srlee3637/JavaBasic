package day07;

import java.util.Scanner;

public class BreakEx02 {

	public static void main(String[] args) {
		
		/*
		 * 무한루프
		 * 반복의 횟수를 정확히 가늠할 수 없을때 무한루프를 만들고
		 * break문으로 빠져나오도록 처리
		 */
		
		//정답을 맞출때까지 계속 정답을 입력받는 프로그램
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("4 x 6 = ?");
			System.out.print(">");
			
			int answer = scan.nextInt();
			
			//24라면 탈출
			if(answer == 24) {
				System.out.println("정답인데요?");
				break;
			}
			
			System.out.println("틀렸는데요?");
		}
		
		
		scan.close();
		System.out.println("프로그램을 종료합니다");
		
		
		
		
		
		
		
	}
	
}
