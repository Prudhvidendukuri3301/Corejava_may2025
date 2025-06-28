package oops.Abstraction;

abstract public class AbstractCalculatorClass {

	abstract public int Addition(int a, int b);

	abstract public int Substraction(int a, int b);

	abstract public int Multiplication(int a, int b);

	public int Division(int a, int b) {
		return (a / b);

	}

	public int Moddivision(int a, int b) {
		return (a % b);

	}

}
