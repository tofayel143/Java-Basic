package Assignment_1;

import java.util.Scanner;

public class SmallestNum {
	
	public void SmallestNumber(int x, int y, int z) {
        int smallest;
        
        if (x < y && x < z) {
            smallest = x;
        } else if (y < x && y < z) {
            smallest = y;
        } else {
            smallest = z;
        }

        System.out.println("The smallest number among " + x + ", " + y + ", and " + z + " is: " + smallest);
    }

	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			SmallestNum obj = new SmallestNum();
			
			System.out.println("Enter the first number: ");
			int num1 = scanner.nextInt();
			
			System.out.println("Enter the second number: ");
			int num2 = scanner.nextInt();
			
			System.out.println("Enter the third number: ");
			int num3 = scanner.nextInt();
			
			obj.SmallestNumber(num1, num2, num3);
		}
        
    }

  }
