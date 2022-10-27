package day04;

public class WhileEx03 {

	public static void main(String[] args) {
		//3의 배수의 개수 구하기
		
		int i = 1;
		int count = 0;
		while(i<=100) {
			if(i%3==0) {
				count++;
			}
			i++;
		}
		
		System.out.println("3의 배수의 개수:" + count);
	}

}
