package day03;
import java.util.*;
public class SwitchEx02 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		
		String g = null;
		switch (p/10) {
		case 10:
		case 9:
			if(p>=95) {
				g = "A+";
			}
			else g = "A";
			
			
			break;
		case 8:
			g = "B";
			break;
		case 7:
			g = "C";
			break;
		case 6:
			g = "D";
			break;
		default:
			g = "F";
			break;
		}
		System.out.println(g);
	}
}
