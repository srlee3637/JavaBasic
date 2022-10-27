package day05;
import java.util.*;
public class ForEx02 {

	public static void main(String[] args) {
		
		/*
		 * 정수를 입력받고, 입력한 정수가 소수인지 판별
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수>");
		int num = sc.nextInt();
		int count  = 0;
		for(int i = 1; i <= num; i++) {
			if(num % i ==0) {
				count++;
			}
		}
		
		System.out.println(count ==2 ? num + "은 소수" : num + "은 소수가 아님");
	}

}
