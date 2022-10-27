package day02;

public class OperatorCondition 
{

	public static void main(String[] args) 
	{	
		//프로그램에서 랜던한 값은 유효한 의미를 가진다.
		int num = (int)(Math.random()*10) + 1;
		System.out.println(num); // 0이상 ~ 1.0미안 랜덤값 출력
		//유효한 점수 랜덤값 1~10
		
		/*
		 * 3항 연산자
		 * -피 연산자가 3개인 연산자를 말한다.
		 * 조건식? 연산식1:연산식2
		 * 조건식의 결과값이 참이면 연산식1, 거짓이면 연산식2 
		 */
		String result = num % 3 == 0? "3의 배수" : "3의 배수가 아님";
		System.out.println(result);
		
		System.out.println("----------------------------------");
		/*
		 * 1~100까지 랜덤한 정수를 생성
		 * 짝수인지 홀수인지 출력
		 */
		int num1 = (int)(Math.random() * 100) + 1;
		String result1 = num1%2 ==0 ? "짝수" : "홀수";
		System.out.println(num1);
		System.out.println(result1);
		
		
		System.out.println("----------------------------------");
		/*
		 * -5~5까지 랜덤한 정수를 생성(0~10) -5
		 * 어떤 정수가 나오든 절대값으로 출력. (양의 정수로)
		 */
		
		int num2 = (int)(Math.random()*11) -5;
		int result2 = num2 > 0 ? num2 : -num2;
		System.out.println(num2);
		System.out.println(result2);
		
		/*
		 * 계산순서
		 * 소괄호 > 단항 >  이항 > 삼항 >  대입 > a++(이거는 항상 제일 마지막)
		 */
		
		
		
	}

}
