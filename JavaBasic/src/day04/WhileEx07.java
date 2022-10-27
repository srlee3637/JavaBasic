package day04;
import java.util.*;
public class WhileEx07 {

	public static void main(String[] args) {
		//최대값을 찾아라
		int[] arr = {50 , 30, 40, 60, 70, 90, 100, 110, 20};
		int  i = 0;
		int max = arr[0];
		while(i < arr.length) {
			if(arr[i] > max) {
				max = arr[i];
			}
			i++;
		}
		
		System.out.println("최대값은: " + max);
		
		
		int min = arr[0];
		i = 0;
		while(i < arr.length) {
			if(arr[i] < min) {
				min = arr[i];
			}
			i++;
		}
		
		System.out.println("최소값은: " + min);
		
		
		
		
	}

}
