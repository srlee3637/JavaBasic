package day01;
import java.util.*;
public class VariableScope 
{
	public static void main(String[] args)
	{
		int num1 = 10, num2 = 20;
		int num4 = 0; //초기화
		//변수는 해당 중괄호 안에서만 사용할 수 있습니다.
		//main안에서 만들어진 변수를 지역변수라고 부릅니다.
		if(true)
		{
			int num3 = num1 + num2;
			System.out.println(num3);
			num4 = 200;
		}
		
		int num3 = 100;
		System.out.println(num3);
		System.out.println(num4);
		
		/*Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String[] str1 = str.split(" ");
		
		int A = Integer.parseInt(str1[0]);
		int B = Integer.parseInt(str1[1]);
		
		if(A>B)
		{
			System.out.println(">");
		}
		
		else if(A<B)
		{
			System.out.println("<");
		}
		
		else
		{
			System.out.println("==");
		}
		*/
	}
}
