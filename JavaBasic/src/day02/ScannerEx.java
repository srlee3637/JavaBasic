package day02;
import java.util.Scanner;
public class ScannerEx 
{
	public static void main(String[] args)
	{
		//1. 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름>");
		String name = scan.next(); //문자열을 입력받고 name변수에 저장
				
		System.out.print("나이>");
		int age = scan.nextInt();
		
		System.out.println("입력된 이름:"+ name);
		System.out.println("입력된 나이:"+ age);
		
		scan.close();//스캐너 닫기.
	}
}
