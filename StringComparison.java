package Assignment_1;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
			System.out.println("Enter the first string: ");
			String str1 = input.nextLine();
			
			System.out.println("Enter the second string: ");
			String str2 = input.nextLine();
			
			if (str1.equalsIgnoreCase(str2)) {
			    System.out.println("The two strings are equal.");
			} 
			
			else {
			    System.out.println("The two strings are not equal.");
			}
		}

    }
}

