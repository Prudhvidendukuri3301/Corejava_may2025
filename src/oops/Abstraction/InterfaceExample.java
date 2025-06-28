package oops.Abstraction;

public interface  InterfaceExample {
	
	public static final int A=100;
	
     String STR ="prudhvi";
     
     public abstract void addition(int a, int b);
     
     void substraction(int a, int b);
     public static void dispaly() {
    	 System.out.println("this is interface");
    	 
     }
     
     
     default public void multiplication(int a, int b){
    	 System.out.println(a*b);
     }
     
		   
		   
	
	
	
	
	

	public static void main(String[] args) {
		InterfaceExample.dispaly();
		
		System.out.println(InterfaceExample.A);
		System.out.println(InterfaceExample.STR);
		
		

	}

}
