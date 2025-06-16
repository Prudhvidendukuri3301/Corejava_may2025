package fundamentals;

public class WrapperClasses {

	public static void main(String[] args) {
    
		byte b1=100;
		String str1 = String.valueOf(b1);
		
		String str2 = "100";
		byte b2 = Byte.parseByte(str2);
		
		String str3 = "True";
		boolean bool1 = Boolean.parseBoolean(str3);
	   System.out.println(bool1);
		

		System.out.println(Byte.MIN_VALUE);

	}

}
