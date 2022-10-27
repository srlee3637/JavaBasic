package day02;

import java.util.Arrays;

public class SwitchEx03 {
	public static void main(String[] args) {
		String[] arr = {"안녕", "hello", "사요나라", "@#$"};
		
		//System.out.println(Arrays.toString(arr));
		/*
		 * Math.random()을 사용해서 배열의 인덱스 범위(0~3) 까지 랜덤수를 만듭니다
		 * 랜덤수를 배열의 index 적용을 하여 출력된 단어가
		 * 한국어, 영어, 일본어, 알수없는 언어
		 * 인지 처리를 해보세요
		 */
		int a = (int)(Math.random()*4);
		
		switch (a) {
		case 0:
			System.out.println("한국어");
			break;
		case 1:
			System.out.println("영어");
			break;
		case 2:
			System.out.println("일본어");
			break;
		default:
			System.out.println("알 수 없는 언어");
			break;
		}
		
	}
}
