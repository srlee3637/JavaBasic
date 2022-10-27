package day01;

public class TypeText 
{

	public static void main(String[] args) 
	{
		
		//단일문자를 저장하는 char
		
		char c1 ='A';
		char c2 = 65;
		
		
		System.out.println(c1);
		System.out.println(c2);
		// 아스키코드 - > 유니코드의 등장으로 2byte로 확장되고 부호 없는 비트값 65536개의 문자를 표기
		char c3 = '가';
		char c4 = 44032;
		char c5 = '\uAc00';
		
		System.out.println(c3 + " " + c4 + " " + c5);
		
		String s1 = "hello";
		String s2 = " world";//공백도 문자로 인식됨
		
		// 문자열은 + 로 연결하면 붙인 결과를 가져옵니다.
		System.out.println(s1 + s2);
		
		//문자열은 길이를 확인 length()
		System.out.println(s1.length() +" " + s2.length()); // 5 6
		
		//문자열과 다른 타입의 + 연산
		System.out.println(100 + 200); //300
		System.out.println("100" + 200); //문자열에 다른 타입이 붙으면 -> 결과는 문자열  
		System.out.println(100 + 200 + "world"); //300 world
		System.out.println("hello" + 100 + 200); //hello 100 200
		
		//??
		System.out.println("A" + 10); //A10
		System.out.println('A' + 10); //75
		System.out.println((char)('A' + 10)); //75
		
		
		
		
		
		
		
	}
	
	
	
	   /* public static long solution(int price, int money, int count) {
	        long answer = -1;
	       	long total = 0;
	        for(int i = 1; i<=count; i++)
	        {
	            total = total + price * i;
	        }
	        answer = total -  money ;
	        if(answer<=0)
	        {
	            answer = 0;
	        }
	        return answer;
	    }
	*/

}
