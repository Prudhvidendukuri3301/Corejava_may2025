package fundamentals;

public class ConstructorExample {
	
	static String a;
	static int b;
	
	char c;
	float d;


    public ConstructorExample() {
    	a="Hello";
       b=200;
       c='A';
       d=10.5F;
      }
     
      public static void addition(int a, int b) {
    	//  int c=10;
    	//  int d=20;
			System.out.println(a);
			System.out.println(b);
    	  
      }
    
      public static void Substraction(int a, int b) {
    
			System.out.println(a);
			System.out.println(b);
    	  
      }
    
		public static void main(String[] args) {
			
			System.out.println(a);
			System.out.println(b);
			addition(100,200);
			
			ConstructorExample consex = new ConstructorExample(); 
			System.out.println(consex);
			System.out.println(consex.c);
			System.out.println(consex.d);
			consex.Substraction(1000, 2000);
		}

}
