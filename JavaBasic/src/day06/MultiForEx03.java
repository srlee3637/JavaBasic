package day06;
import java.util.*;
public class MultiForEx03 {

	public static void main(String[] args) {

		/*
		 * 입력 받은 수까지 소수를 출력.
		 * 소수 -> 나누어 떨어지는 수가 1과 자기 자신인 수
		 * 예) 5-> 2, 3, 5
		 * 입력 받은 수까지 반복하고, 각 수를 자기 자신까지 나누면서 약수의 개수가 2개인 수
		 */
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			
			int count = 0;
			
			for(int j = 1; j <= i; j++) {
				
				if(i%j==0) {
					count++;
				}
			}
			
			if(count == 2) {
				
				System.out.println(i);
			}
		}
	}

}
