package day04;
import java.util.*;
public class WhileEx05 {

	public static void main(String[] args) {
		/*
		 * 반복문 안에서의 입력
		 * 1개의 정수를 받아서
		 * 반복의 횟수를 결정
		 * 
		 */
		Scanner s = new Scanner(System.in);
		
		System.out.print("반복 횟수>");
		int a = s.nextInt();
		int i = 1;
		int sum = 0; //누적할 변수
		
		while(i <= a) {
			
			System.out.print(">");
			int b = s.nextInt();
			sum += b;
			i++;
			
		}
		System.out.println("합은>" + sum + "\n끝");
		s.close();
	}

}
