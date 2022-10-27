package day04;
import java.util.*;
public class WhileEx04 {

	public static void main(String[] args) {
		/*
		 * 정수를 입력받는다
		 * 입력받은 정수까지의 합 
		 */
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= a) {
			sum +=i;
			i++;
		}
		System.out.println(sum);
	}

}
