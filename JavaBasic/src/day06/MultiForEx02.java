package day06;
import java.util.*;
public class MultiForEx02 {

	public static void main(String[] args) {

		/*
		 * 회전 할 때마다 횟수가 변하는 중첩반복문
		 *      *
		 * 	   ***
		 *    *****
		 *   *******
		 *  *********
		 */
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();


		for(int i = 1; i <= a; i++) {



			for(int j = 1; j <= a - i; j ++ ) {
				System.out.print(" ");
			}


			for(int j = 1; j <= i * 2 - 1;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		System.out.println("-------------------------------------------");
		
		
		
		/*
		 * 회전 할 때마다 횟수가 변하는 중첩 반복문
		 *  *********
		 *   *******
		 *    *****
		 *     ***
		 *      *
		 */

		for(int i = a; i > 0 ; i--) {

			if(i<a) {

				for(int j = 1; j <= a - i; j ++ ) {
					System.out.print(" ");
				}

			}
			for(int j = 1; j <= i * 2 - 1;j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
