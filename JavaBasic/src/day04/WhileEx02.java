package day04;

public class WhileEx02 {
	public static void main(String[] args){
		//100번 회전하는 반복문에서 짝수만 출력
		int i = 1;
		while(i<=100) {
			
			if(i%2==0) {
				System.out.print(i + " ");
			}
			
			i++;
			
		}
		System.out.println(); //줄바꿈
		
		//100번 회전하는 반복문에서 짝수만 출력
		int j = 2;
		while(j <= 100) {
			
			j+=2;
		}
	}
}
