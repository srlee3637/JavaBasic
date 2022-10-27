package day04;

public class WhileEx06 {

	public static void main(String[] args) {

		/*
		 * 배열 과 반복문
		 * 시작은 0~길이 미만
		 */

		int [] arr = {1,2,3,4,5,6,7,8,9,10};
		int i = 0 ;
		int sum  = 0;
		while(i < arr.length) {//i <= arr.length -1;
			System.out.println(arr[i]);
			sum += arr[i];
			i++;
		}

		System.out.println("배열 요소의 합:" + sum);

	}

}




