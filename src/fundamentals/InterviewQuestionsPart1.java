package fundamentals;

public class InterviewQuestionsPart1 {


private static final String Number = null;


public static void swapValuesWithoutUsing3rdVariable() {
	System.out.println("-----------------swap values without using third variable--------------");
	int a = 100;
	int b = 200;

	System.out.println("Before Swaping A value: " + a);
	System.out.println("Before Swaping B value: " + b);

	a = a + b; // 100+200 = 300
	b = a - b; // 300-200 = 100
	a = a - b; // 300 -100 = 200
	System.out.println("After Swaping A value: " + a);
	System.out.println("After Swaping B value: " + b);
}
//swap two String values without using third variable
	public static void swapStringValuesWithoutUsing3rdVariable() {
		System.out.println("-----------------Swap two String values without using third variable--------------");
		String string1 = "Hello";
		String string2 = "Java";

		System.out.println("Before Swaping String1 value: " + string1);
		System.out.println("Before Swaping String2 value: " + string2);

		string1 = string1 + string2; // HelloJava
		string2 = string1.replace(string2, ""); // Hello
		string1 = string1.replace(string2, ""); // Java

		System.out.println("After Swaping String1 value: " + string1);
		System.out.println("After Swaping String2 value: " + string2);
	}
	// print odd number between given numbers
		public static void printOddNumbers(int startingValue, int endingValue) {
			System.out.println("-----------------print odd numbers between given numbers--------------");

			for (int i = startingValue; i <= endingValue; i++) {
				if (i % 2 == 1) {
					System.out.print(i+ " " );
				}
			}
		}

		// write a program to check the given number is prime or not
		public static void checkPrimeNumber(int givenNumber) {
			System.out.println("-----------------------check the given number is prime or not------------------");
			int count = 0;
			for (int i = 1; i <= givenNumber; i++) {
				if (givenNumber % i == 0) {
					count++;
				}
			}

			if (count <= 2) {
				System.out.println(givenNumber + " is a Prime Number");
			} else {
				System.out.println(givenNumber + " is not a Prime Number");
			}
		}

		// write a program to print prime numbers between the given range
		public static void printPrimeNumberBetweenGivenRange(int startingValue, int endingValue) {
			System.out.println("-----------------------print prime numbers between given range------------------");

         System.out.println("prime numbers between starting value"+" " +"and"+" "+ "ending value");
         for (int i = startingValue; i <= endingValue; i++) {
 			int count = 0;
 			for (int j = 1; j <= i; j++) {
 				if (i % j == 0) {
 					count++;
 				}
 			}

 			if (count <= 2) {

 				System.out.print(i + " ");
 			}
 		}


		}
		

		public static void checkArmstrongNumber(int number) {
		    
		    
		        int tempNum = number;
		        int sum =0;
		        
		        	
		        while (tempNum > 0) {
		            int remainder = tempNum % 10;
		          sum= sum+(remainder*remainder*remainder);
		            tempNum = tempNum/10;
		        }

		    
		        if (sum == number) {
		            System.out.println(number + "  Number is an Armstrong number.");
		        } else {
		            System.out.println(number + "  Number is not an Armstrong number.");
		        
		    }
		}
		    

	public static void main(String[] args) {
//	swapValuesWithoutUsing3rdVariable();
//	swapStringValuesWithoutUsing3rdVariable();
//	printOddNumbers(1,20);
//	checkPrimeNumber(3);

//		printPrimeNumberBetweenGivenRange(1,100);
		checkArmstrongNumber(153);
	
}
}