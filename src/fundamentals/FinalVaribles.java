package fundamentals;

public class FinalVaribles {

	int a=100;
	static int b=200;
	
	public static void method1(int d) {
		System.out.print(d);
		
	}
	public static void main(String[] args) {
	int c=300;
	
	FinalVaribles Finalvar = new FinalVaribles();
	
	System.out.println(Finalvar.a);
	System.out.println(FinalVaribles.b);
	System.out.println(c);
	FinalVaribles.method1(400);
}

}
