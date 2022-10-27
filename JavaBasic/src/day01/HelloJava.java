
package day01;
import java.util.*;
public class HelloJava 
{


	public static int[] solution(String s){
		int[] answer = {};
		answer = new int[2];
		int zero = 0;
		int change = 0;

		int a = 0;

		//01110

		String d = "";
		while(d.equals("1"))
		{

			for(int i=0; i<s.length(); i++)	{

				if(s.charAt(i)=='0') {
					zero++;
					continue;
				} else {
					d+=s.charAt(i);
				}


				//s = Integer.toBinaryString(str1.length);
				//String str1 = Integer.toBinaryString(str1.length());
			}
		}
		System.out.println(zero);
		System.out.println(d);

		//			s = Integer.toBinaryString(a);
		//			System.out.println("s" + s);
		//			System.out.println("Zero:" + zero);
		//			
		//			
		//
		//		answer[0] = change;
		//		answer[1] = zero;
		return answer;
	}

	public static void main (String[] args)
	{
		int[] a = solution("01110");
	}



}
/*
 * 여러줄 주석입니다.
 */
/*int[] arr2 = new int[6];
int[] arr1 = {1,1,2,2,2,8};
System.out.println("hello java\n"); // \n은 쥴바꿈입니다.
System.out.println("안녕하세요"); 

 */


//int a = solution(626331) ;


/*Scanner s = new Scanner(System.in);

// 크기가 10인 배열 arr 생성
int[] arr = new int[6];

// 정수를 입력받아 arr배열에 저장
for (int i = 0; i <6; i++) {

	arr[i] = s.nextInt();
	arr2[i]=arr1[i] - arr[i];


}
for (int j = 0; j<6; j++)
{
	System.out.print(arr2[j]+" ");
}
\*/
/*public static int solution(int num) 
	{
		int answer = 0;
		int count = 0;

		if(num == 1)
		{
			answer = 0;
		}

		while(count < 500)
		{
			count++;

			System.out.println(count);

			if(num % 2 == 0)
			{
				num = num / 2;
				System.out.println("짝수일 때" + num);
				if(num == 1)
				{
					answer = count;
					break;
				}
			}

			else 
			{
				num = 3 * num + 1;
				System.out.println("홀수일 때" + num);

			}

		}
		if(count > 500)
		{
			answer = -1;
		}

		return answer;
	}
 */
/*public static int[] solution(String s) 
	{
		int[] answer = {};
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int a =0;
		while(count<20)
		{
			int [] my = new int[s.length()]; 
			int [] my1 = new int[s.length()];
			String[] str = s.split("");
			for(int i = 0; i < s.length(); i++)
			{

				my[i]=Integer.parseInt(str[i]);
				if(my[i] == 1)

				{
					my1[i]=my[i];
					System.out.println("my1:" + my1[i]);
					count2++;
					a=count2;
				}
				else
				{
					count++;

				}
			}
			System.out.println(a);
			String str1 = Integer.toBinaryString(a);
			s = str1;
			a=0;
			System.out.println("s:" + s);

			count1++;

		}

		answer[0] = count;
		answer[1] = count1;
		return answer;
	}*/