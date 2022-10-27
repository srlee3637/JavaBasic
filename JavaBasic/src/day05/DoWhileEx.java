package day05;

public class DoWhileEx {

	public static void main(String[] args) {
		//while문이 do~while 대체 할 수 있어서 많이 사용하지 x
		//1~10합
		
		int sum = 0;
		int i = 1;
		while(i <= 10) {
			
			sum+=i;
			i++;
		}
		
		System.out.println(sum);
		
		sum = 0;
		i = 1;
		do {
			sum+=i;
			i++;
			
		} while (i<=10);
		
		
		System.out.println(sum);
		
		
	}

}
