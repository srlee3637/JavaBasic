package day02;

public class OperatorEx01 
{

	public static void main(String[] args) 
	{
		//단항 연산자
	    int i = -3;
		int j = -i;
		System.out.println(j);
		
		//++,--
		int k = 1;
		k++;
		System.out.println(k);//2
		k--;
		System.out.println(k);//1
		
		//++,-- 증감 연산자는 a++, ++a 의미가 조금 다름.
		System.out.println(k);
		int a = ++k;
		System.out.println(a);
		int b = k++;
		System.out.println(b);
		System.out.println(k);
		k=1;
		int h = k++;
		System.out.println(h);
		System.out.println(k);
		
		k=1;
		int g = ++k;
		System.out.println(g);//2
		System.out.println(k);//2
		
		k=1;
		System.out.println(k++);
		System.out.println(++k);//2
		
		System.out.println("------------------------------");
		//~연산자 - 2진수값은 반대로
		byte b1 = 10;//0000 1010
		System.out.println(~b1); //1111 0101: -11
		System.out.println(~b1 + 1);// 1111 0110: -10
		
		System.out.println("------------------------------");
		
		System.out.println(!true); //false
		boolean bool = !false;
		System.out.println(bool); //true
		
		
		
		
		
		
		
		
		
	}

}
