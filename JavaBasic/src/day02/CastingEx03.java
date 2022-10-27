package day02;
public class CastingEx03 
{

	public static void main(String[] args) 
	{
		//연산에서의 형변환
		char c = 'C'; //67  A:65
		int i = 2;
		
		int b = c + i;
		System.out.println(b);
		
		/*
		 * 서로 다른 탑입의 데이터의 연산을 진행할 경우 두 데이터 중 큰 데이터 타입을 가진 쪽에 맞추어 자동 형 변환된 후 연산을 진행한다.
		 * byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		 */
		
		char cc = (char)(c + i);
		int ii = c+i;
		
		System.out.println(cc);//E
		System.out.println(ii);//69
		
		int j = 10;
		double d = 3.14;
		double result = j + d;
		
		System.out.println(result);// 13.14
		
		//2. int형 보다 작은 타입의 연산의 결과는 int가 된다.
		byte b1 = 100;
		byte b2 = 10;
		byte b3 = (byte)(b1+b2);
		
		short s1 = 100;
		byte s2 = 10;
		
		short s3 = (short)(s1+s2);
	}
	

}
