package day02;
import java.util.*;

public class SystemOut 
{

	public static void main(String[] args) 
	{
		/*
		 * 단축키 
		 * ctrl x는 잘라내기
		 * end, home으로 커서를 마지막, 처음으로 이동
		 * shift end
		 * 
		 * 정렬키
		 * ctrl a, ctrl i; 
		 * 행삭제
		 * ctrl d
		 * 
		 * 행복사
		 * ctrl alt 방향키
		 * 
		 * 코드 이동
		 * alt 방향키
		 * 
		 * 빠른주석
		 * ctrl /
		 */
			




		// 문자와 숫자
		// ctrl + s, ctrl + F11
		System.out.print("1");
		System.out.print("\n");
		System.out.print(1);
		System.out.print("\n");

		// sysout 이라고 적고 ctrl + space 출력문을 자동생성
		System.out.println("안녕하세요");
		System.out.println("반갑습니다");

		// 형식을 지정하는 출력문 printf
		// 문자형식을 미리지정하고, 필요한 출력값을 지정하는 형태
		// %d 정수 %s 문자열 %f 실수
		System.out.printf("안녕하세요. 제 이름은 홍길동 입니다.\n");
		System.out.printf("안녕하세요. 제 이름은 %s %d 입니다.", "홍길동", 1);
		System.out.printf("오늘은 %d월 %d일 입니다\n",9,20);
		System.out.printf("파이의 값은 %.2f입니다\n",3.14);
		System.out.printf("%d x %d = \t%d%d x %d = %d\n", 5,4,2,0,1,20); //\t는 8칸 들여쓰기

		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		/*
		 * 단축키 
		 */


	}

	/*
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|
	 */
}
