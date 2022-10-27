package day07;
import java.util.*;
public class ArraySearch01 {

	public static void main(String[] args) {
		//배열을 다루는 방법
		Scanner sc = new Scanner(System.in);
		
		//탐색 -> 순차 탐색, 이진 탐색
		int[] arr = {30, 10, 20, 50, 40, 60, 100, 110, 90, 80};
		
		// 입력 박은 값의 위치를 출력
		int find = sc.nextInt();
		
		int index = -1;
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == find) {//찾은 경우
				index = i; // 인덱스의 값을 수정
				break;
			}
		}
		
		System.out.println("인덱스 위치: " + index);
	}

}
