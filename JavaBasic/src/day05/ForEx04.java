package day05;
import java.util.*;
public class ForEx04 {

	public static void main(String[] args) {
		//변수의 swap

		//		int x = 10;
		//		int y = 5;
		//		int temp = x;
		//		x = y;
		//		y = temp;
		//		
		//		System.out.println("x:" + x  + ",y:" + y);

		//배열의 swap - 배열을 10번 랜덤하게 섞는다.

		int[] arr = {1,2,3,4,5,6,7,8,9,10};

		for(int i = 0; i < arr.length; i++) {
			int ran = (int)(Math.random()*9)+1;
			int temp = arr[0];
			arr[0] = arr[ran];
			arr[ran] = temp;

			System.out.println(Arrays.toString(arr));
		}
	}

}
