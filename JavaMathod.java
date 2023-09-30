package Assignment_1;

import java.util.Scanner;

public class JavaMathod {
	
	public void sum(int x, int y) {
		System.out.println("Summation: "+(x+y));
	}
	
	public void minus(int x, int y) {
		System.out.println("Subtraction: "+(x-y));
	}
	
	public void multi(int x, int y) {
		System.out.println("Multiplication: "+(x*y));
	}
	
	public void div(int x, int y) {
		System.out.println("Divition: "+(x/y));
	}
	
	public void remin(int x, int y) {
		System.out.println("Remainder: "+(x%y));
	}

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) {
			
			System.out.println("Enter First Number: ");
			int num1 = input.nextInt();
			
			System.out.println("Enter Second Number: ");
			int num2 = input.nextInt();
			
			JavaMathod math = new JavaMathod();
			math.sum(num1, num2);
			math.minus(num1, num2);
			math.multi(num1, num2);
			math.div(num1, num2);
			math.remin(num1, num2);
		}
		
	}

}
