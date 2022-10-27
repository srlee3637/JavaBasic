package day07;
import java.util.*;
public class ArraySearch03 {

	public static void main(String[] args) {

		int[] arr = {30, 50, 80, 100, 110, 250, 300, 500};
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		System.out.println(Arrays.binarySearch(arr, num) );
		int left = 0;
		int right = arr.length - 1;
		int count  = -1;
		
		while(left <= right) {
			
			int mid = (right+left)/2;
			
			if(num == arr[mid]) {
				System.out.println("정답: " + mid + "번째에 index 위치해 있습니다");
				count = 1;
				break;
			}
			
			else if(num > arr[mid]) {
				left = mid + 1;
			}
			
			else {
				right = mid - 1;
			}
		}
		if(count<0)
		System.out.println("답 없음");
		
		
	}

}
