package oops.polymorphism;

public class UpcastingAndDowncasting {

	public static void main(String[] args) {

		ArthematicOpertaions ArOp = new ArthematicOpertaions();

		ArOp.addition(10, 1);
		ArOp.multiplication(10, 5);
		ArOp.division(10, 5);
		ArOp.subtraction(10, 5);
//		ArOp.modDivison();

		NewArthematicOpertaions NArOp = new NewArthematicOpertaions();

		NArOp.addition(10, 1);
		NArOp.multiplication(10, 5);
		NArOp.division(10, 5);
		NArOp.subtraction(10, 5);
		NArOp.modDivison(10, 5);

		ArOp = NArOp;
		ArOp.addition(10, 1);
		ArOp.multiplication(10, 5);
		ArOp.division(10, 5);
		ArOp.subtraction(10, 5);

		NArOp =  (NewArthematicOpertaions) ArOp;
		NArOp.addition(10, 1);
		NArOp.multiplication(10, 5);
		NArOp.division(10, 5);
		NArOp.subtraction(10, 5);
		NArOp.modDivison(10, 5);

	}
}