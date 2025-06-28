package oops.Abstraction;

public class ImplementInterfaceExample implements InterfaceExample {

	@Override
	public void addition(int a, int b) {
		System.out.println(a + b);

	}

	@Override
	public void substraction(int a, int b) {
		System.out.println(a - b);
	}

	public static void main(String[] args) {
		InterfaceExample Ife = new ImplementInterfaceExample();
		Ife.addition(10, 20);
		Ife.substraction(20, 10);
		InterfaceExample.dispaly();
		System.out.println(A);

	}

}
