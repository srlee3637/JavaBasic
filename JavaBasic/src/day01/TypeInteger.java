package day01;

public class TypeInteger 
{

	public static void main(String[] args) 
	{
		//byte, short, int, long
		
		byte a = 127;
		byte b = -128;
		
		short c = 32767;
		short d = -32768;
		
		int e = 2147483647;
		int f = -2147483648;
		
		long g = 123123123123123123L; //Long은 L을 붙임
		System.out.println(g);
		
		/*
		 * 2진수 저장할 때는 0b를 붙임
		 * 8진수 저장할 때는 0을 붙임
		 * 16진수 저장할 때는 0x를 붙임
		 */

		int bin = 0b1010;//2진수
		int octa = 064; //8진수
		int hexa = 0xAC00;//16진수
		
		System.out.print(bin + "\n" + octa + "\n" + hexa);
		System.out.println("-------------------------------------");
		
		float f1 = 3.14F; //float을 나타낼때는 F를 붙임 32라 7칸 소수부분
		double d1 = 3.14; // 64라 15칸 소수부분
		
		float f2 = 3.1415923333F; // 7자리까지 유효
		double d2 = 3.1415921333; // 15자리까지 유효
		System.out.println(f1 + "\n" + d1);
		System.out.println(f2 + "\n" + d2);
		
		System.out.println("-------------------------------------");
		
		//e 표기법
		
		float f3 = 314.15e-2F;// 10 -2숭
		double d3 = 0.031415e2;//10 2승
		System.out.println(f3);
		System.out.println(d3);
		if(f3 == d3)
		{
			System.out.println("==");
		}
		
		else
		{
			System.out.println("!=");
		}
		System.out.println("-------------------------------------");
		
		boolean bool1 = true;
		boolean bool2 = false;
		
		System.out.println(bool1);
	}

}
