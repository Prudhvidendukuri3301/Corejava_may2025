package oops.Abstraction;

public class UseAbstractCalculatorClass {

	public static void main(String[] args) {
		
		AbstractCalculatorClass Acc = new ImplementAbstractCalculatorCalss();
		System.out.println(Acc.Addition(9, 6));
		
//		Acc.Substraction(5, 6);
//		Acc.Multiplication(9, 5);
		
	}
}
