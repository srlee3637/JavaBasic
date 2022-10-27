package day03;
import java.util.*;

public class IfEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		// 입력받은 점수에 따라서 A, B, C, D, F 로 출력
		System.out.print("점수>");
		int point = s.nextInt();

		s.close();
		String grade = null;//변수의 선언
		
		if(point >= 90) {
			grade = "A";
			//조건 검사 또
			if(point >= 95) {
				grade = "A+";
			}else {
				grade = "A0";
			}
		} else if(point >=80){
			grade = "B";
			
		} else if(point >=70) {
			grade = "C";
			
		} else if(point >=60) {
			grade = "D";
			
		} else {
			grade = "F";
			
		}
		System.out.println(grade);
	}
}

