package day05;

import java.util.Arrays;
import java.util.Iterator;

public class ForEx03 {
	public static void main(String[] args) {
		//for 문으로 배열의 사용
//		int[] arr = {1,2,3,4,5,6,7,8,9,10};
//		
//		for(int i : arr) {
//			System.out.println(i);
//		}
		
		// 100개의 크기를 갖는 int 배열에 3의 배수만 순서대로 저장
		int[] arr = new int[100];
		int three = 3;
		for(int i = 0; i < arr.length; i++) {
				
			arr[i] = three;
			three+=3;
			
		}
		System.out.println(Arrays.toString(arr));
	}
}
