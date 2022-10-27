package day11;
import java.util.*;

public class MethodEx04 {
	
	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 5};
		String[] arr2 = {"월" , "화", "수"};
		
		
		method01(arr); //변수명 or 생성 구문 넣어주면 된다.
		//method01({1,2,3,4,5,}) 자바에서 이형식은 제공을 하지 않음 
		
		method02(arr, arr2);
		
		int[] arr3 = method03();
		System.out.println(Arrays.toString(arr3));
		
		String[] arr4 = "str".split("");
		System.out.println(Arrays.toString(arr4));
	}
	
	//정수 배열을 매개변수로 받는 메서드
	static void method01(int[] a) {
		//a를 이용해서 배열값 사용가능
		
		System.out.println(Arrays.toString(a));
	}	
	//정수 배열과, 문자열 배열을 매개변수로 받는 메서드
	static int method02(int[] arr, String[] arr2) {
		
		for(int a: arr) {
			System.out.println(a);
		}
		
		//~~~
		return 0;
	}
	//배열을 반환하는 메서드
	static int[] method03() {
		
		int[] arr = new int[5];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		return arr;
	}
}
