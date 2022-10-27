package day11;

public class PenMain {

	public static void main(String[] args) {

		Pen black = new Pen();
		
		black.color = "검정";
		black.price = 1000;
		black.company = "모나미";
		
		black.write();
		black.info();
		
		
		Pen red = new Pen();
		red.color = "빨강";
		red.price = 2000;
		red.company = "모나미";
		
		red.write();
		red.info();
		
		
		Calculator cal = new Calculator();
		cal.add(1000);
		cal.add(2000);
		
		
		
	}

}

