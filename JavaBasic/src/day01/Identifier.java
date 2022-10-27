package day01;

import java.util.*;

public class Identifier 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		int age = 10;
		int Age = 20;
		int agE = 30;
		
		int phonenumber = 4;
		int phoneNumber = 5;
		
		int num1 = 1;
		int num2 = 2;
		// int 1num = 1; 불가능
		
		boolean answer = true;
		Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = a;
        int d = 0;
        int b = (int)(Math.log10(a)+1);
        int [] arr = new int[b];
        
		for(int i=b-1; i>=0; i--)
    	{
			
			arr[i] = a%10;
    		a/=10;
    		d+=arr[i];
    	}
		
		if(c%d!=0)
		{
			answer = false;
		}
		
		System.out.println(answer);
    	
	}
	
	public boolean solution(int x) 
    {
        boolean answer = true;
        
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int c = a;
        int d = 0;
        int b = (int)(Math.log10(a)+1);
        int [] arr = new int[b];
        
		for(int i=b-1; i>=0; i--)
    	{
			
			arr[i] = a%10;
    		a/=10;
    		d+=arr[i];
    	}
		
		if(c%d!=0)
		{
			answer = false;
		}
		
        
        return answer;
    }
	

}
