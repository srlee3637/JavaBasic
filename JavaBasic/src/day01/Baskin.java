package day01;
import java.util.Random;
import java.util.*;

public class Baskin 
{

	public static void main(String[] args) 
	{

		Scanner s = new Scanner(System.in);

		int i = 0;
		int end = 0;
		int [] my = new int[31]; 


		while(end<31)
		{
			System.out.printf("\nStart Number with: %d\n",end+1);
			String str = s.nextLine();
			String[] str1 = str.split(" ");
			System.out.print("My answer:");
			int a = 0;
			int j = str1.length;
			int k = 0;

			while(j>0)
			{
				my[i]=Integer.parseInt(str1[k]);
				System.out.print(my[i]+ " ");
				end = my[i];
				i++;
				k++;
				j--;


			}

			if(end==31)
			{
				System.out.println("수영이바보");
				break;
			}

			System.out.printf("end:%d \n",end);
			int end1=end;
			int l = (int)(Math.random() * 3 ) + 1;
			System.out.print("Computer answer:");
			for(int b =0; b<l;b++)
			{
				my[i] = end1 + b + 1;
				System.out.print(my[i]+ " ");
				end = my[i];

				if(end==31)
				{
					System.out.println("컴퓨터바보");
					break;
				}
			}


		}



		/*for(int i =0; i<str.length(); i++)
		{
			System.out.println(str1[i]);
		}*/

		/*int a =3;
		int i =0;
		Random random = new Random();
		System.out.println((int)(Math.random() * 3 ) + 1);
		i++;
		System.out.println(i+a+ (int)(Math.random() * 3 )); 
		// TODO Auto-generated method stub
		 */
	}

}
