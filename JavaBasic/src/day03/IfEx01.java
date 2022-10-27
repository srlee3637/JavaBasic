package day03;
import java.util.*;
public class IfEx01 {
	public static void main(String[] args) {
		//0~100 랜덤값
		int point = (int)(Math.random() *101);
		
		System.out.println("점수:" + point);
		
		//점수가 60 이상이라면 ~~~
		if(point>=60) {
			System.out.println("60점 이상입니다");
			System.out.println("합격입니다");
		}
		
		else {
			
			System.out.println("60점 입니다");
			System.out.println("불합격입니다");
		}
	}
	
	

}
