package oops.Inheritance;

public class useCalculator {

	public void displaytext(String text) {
		System.out.println(text);
	}

	public static void main(String[] args) {

		useCalculator usecal = new useCalculator();
		usecal.displaytext("hello");

//		useCalculator usecalc = new useCalculator();
//		usecalc.addition(1, 9);
//		usecalc.subtraction(1, 9);
//		usecalc.multipilication(1, 9);
//		usecalc.division(9, 1);

		Calculator calc = new Calculator();
		calc.addition(1, 9);
		calc.subtraction(1, 9);
		calc.multipilication(1, 9);
		calc.division(9, 1);

		newCalculator newcal = new newCalculator();
		newcal.moddivision(10, 5);
		newcal.addition(1, 9);
		newcal.subtraction(1, 9);
		newcal.multipilication(1, 9);
		newcal.division(9, 1);

	}

}
