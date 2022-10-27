package day08;

import java.util.Arrays;
import java.util.Scanner;



public class ArrayInsert {

	public static void main(String[] args) {
		
		//배열의 한계점 - 크기가 고정
		//입력 받은 문자열을 배열에 순서대로 저장
		// next : 띄어쓰기 기준 nextLine : 엔터 기준
		Scanner sc = new Scanner(System.in);
		String[] arr = new String[100];
		
		int i = 0;//인덱스를 나타내는 변수
		
		//"그만" 문자가 들어오기 전까지 입력
		while(true) {
			
			System.out.print(">");
			String menu = sc.nextLine();
			
			if(menu.equals("그만")) {
				break;
			}
			arr[i] = menu;
			i++;//인덱스 증가
		}
		
		System.out.println(Arrays.toString(arr));//null값이 출력되기 때문에 이건 확인용
		
		
		//출력 실제 Arrays.toString의 구조 
		String str = "[";
		
		for(int j = 0; j < i; j++) {
			
			str += arr[j];
			if(j==i-1) {
				str+="]";
				break;
			}
			str +=", ";
			

		}
		
		System.out.println(str);
		 
	}

}
