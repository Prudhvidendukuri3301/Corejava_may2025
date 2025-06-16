package fundamentals;

public class LoopingStatements {
	
	
	public static void printtables(int number) {
		for   (int i=1;i<=10;i++) {
			System.out.println(number+"X"+i+"="+(i*number));
		
		}
	}
	
	public static void main(String[] args) {
		
		for   (int i=0;i<10;i++) {
		System.out.println("Hello java");

	}
		printtables(10);
		int a=1;
		for   (int i=1;i<=5;i++) {
			for   (int j=1;j<=i;j++) {
				System.out.print(a+" ");
				a++;
			}

	
		System.out.println("");
}
}
}