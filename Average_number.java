package Assignment_1;

import java.util.Scanner;

public class Average_number {
	
		public void avr(int x, int y, int z) {
		int sum = x+y+z;
		int a = (sum/3);
		System.out.println("The Average number among " + x + ", " + y + ", and " + z + " is: "+a);
	}

	public static void main(String[] args) {
		
		try (Scanner input = new Scanner(System.in)) 
		{
			System.out.println("Enter First Number: ");
			int firstNumber = input.nextInt();
			
			System.out.println("Enter Second Number: ");
			int secondNumber = input.nextInt();
			
			System.out.println("Enter Third Number: ");
			int thirdNumber = input.nextInt();

			Average_number object = new Average_number();
			object.avr(firstNumber, secondNumber, thirdNumber);
		}
	
	}
	
}
