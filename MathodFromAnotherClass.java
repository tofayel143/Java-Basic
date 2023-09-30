package Assignment_1;

import java.util.Scanner;

public class MathodFromAnotherClass {

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
