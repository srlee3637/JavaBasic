package day07;

public class BreakEx03 {

	public static void main(String[] args) {
		//중첩반복문의 탈출
		/*
		boolean flag = false;
		for(char c = 'A'; c <= 'Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++){

				System.out.println(c + "-" + l);


				if(l == 'f') {
					flag = true;
					break;
				}

			}//inner

			if(flag) break;
		}*/
		//label:
		ex:for(char c = 'A'; c <= 'Z'; c++) {

			for(char l = 'a'; l <= 'z'; l++){

				System.out.println(c + "-" + l);


				if(l == 'f') break ex;
				
			}

		}
		
	}
}
