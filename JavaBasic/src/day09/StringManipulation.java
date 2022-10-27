package day09;

import java.util.Arrays;

public class StringManipulation {

	public static void main(String[] args) {

		//문자열 다루기
//		String str = new String(new char[] {'A' , 'B' , 'C'});
//		System.out.println(str);

		String str = "안녕하세요~";
		//문자열의 길이를 확인
//		System.out.println(str.length());
		int len = str.length();
		System.out.println(len);

		//문자열 한글자 자르기
		char c = str.charAt(5); //str.charAt(0);
		System.out.println(c);
		
		//문자열의 위치 확인 indexOf , lasIndexOf
		int a = str.indexOf('녕');
		int b = str.lastIndexOf('녕');
		System.out.println("찾은 위치:" + a);
		System.out.println("찾은 위치:" + b);
		int d = str.indexOf("sdf"); 
		System.out.println("찾는 문자가 없다면:" + d); // if(str.indexOf('~') != -1)  --> 이거는 true 
		
		//문자열 변경 - replace
		//str.replace("찾을문자","변경할문자");
		String e = str.replace("안","헐"); //안 -> 헐 (전부다)
		System.out.println(e);
		System.out.println(str); //원본문자는 바뀌지 않음
		
		//대소문자 변경 toUpperCase, toLowerCase
		str ="abcDeFg";
		String f = str.toUpperCase();
		System.out.println(f);
		String g = str.toLowerCase();
		System.out.println(g);
		
		
		//공백제거 trim or replace
		str = "   010-1234-5678    ";
		String h = str.trim();
		System.out.println(h);//앞뒤 공백 제거
		String i = str.replace(" ","");
		System.out.println(i);
		
		str = "  안 녕 하 세 요 개 천 절 날 은 쉽 니 다  ";
		String j = str.trim();
		System.out.println(j);//앞뒤 공백 제거
		String k = str.replace(" ","");
		System.out.println(k);//모든 공백 제거
		
		//String.valueOF() -> 기본타입을 문자로 변경
		System.out.println(10+20); //30
		System.out.println(""+10 + 20);
		System.out.println(String.valueOf(10)+20); //위랑 똑같음
		
		//문자열 가르기 ★
		//substring - 인덱스 기준으로 자름
		//split - 특정 문자 기준으로 잘라서 배열로 담아줌
		//toCharArray -
		str = "010-1234-5678";
		String l = str.substring(3); //인덱스 미만 절삭
		System.out.println(l);
		String m = str.substring(3, 5);//인덱스 이상~ 인덱스 미만 추출
		System.out.println(m);
		
				
		String[] arr = str.split("-"); //str.split("");[0, 1, 0, -, 1, 2, 3, 4, - , 5, 6, 7, 8] 스트링 배열에 담아준다.
		System.out.println(Arrays.toString(arr));//[010, 1234, 5678]
		
		char[] arr1 = str.toCharArray(); // char 배열에 담아준다.
		System.out.println(Arrays.toString(arr1));
		
	}

}
