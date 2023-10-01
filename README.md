
# Java_Basic

This README provides Java code examples and methods to perform various tasks, including calculating averages, finding the smallest number, working with ArrayLists, comparing strings, and performing basic arithmetic operations. Additionally, it demonstrates how to call these methods from another class.


# Introduction

Java is a popular and versatile programming language known for its portability, security, and wide range of applications. This guide will cover the fundamental concepts and syntax of Java.
## Installation

To begin programming in Java, you need to:

1.**Install Java**: 
- Download and install the Java Development Kit (JDK) from [Oracle](https://www.oracle.com/java/technologies/javase-downloads.html) or [OpenJDK](https://openjdk.java.net/).

2.**Install an Integrated Development Environment (IDE)**: 
- IDEs like [Eclipse](https://www.eclipse.org/ide/), [SpringToolSuite](https://spring.io/tools), [IntelliJ IDEA](https://www.jetbrains.com/idea/), or [NetBeans](https://netbeans.apache.org/) can streamline your development process.


    ```bash
     java --version
    ```
3.**Java Environment Variable (JAVA_HOME):**

   - After installing the JDK, set the `JAVA_HOME` environment variable to the JDK installation directory. This allows other tools and applications to locate your Java installation.

   - To verify the installation, open your command prompt and run:

     ```shell
     mvn --version
     ```
5.**IDE for Java (Optional):**

 - For a convenient development experience, I have used an Integrated Development Environment (IDE) such as [Spring Tools Suite](https://spring.io/tools).
## Get Started

After installation, we get started with this project. Clone this repository and open it in your preferred IDE. You can also build and run the project using Maven.

This repository includes Java code examples for getting started with automation testing, covering essential methods and basic operations.


## Java Methods and Programs

#### 1. Java Method to Compute the Average of Three Numbers

```java
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
```
![Average_number](https://github.com/tofayel143/Java-Basic/blob/main/Image/Average_number.png)

#### 2. Java Method to Find the Smallest Number Among Three Numbers.

```java
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

```

![Smallest_number](https://github.com/tofayel143/Java-Basic/blob/main/Image/Smallest_number.png)

#### 3. Java Program to Create an ArrayList, Add Elements, and Print the Collection

```java
import java.util.ArrayList;

public class ArrayListExample {
	
    public static void main(String[] args) {
    	
        // Create a new ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<String>();
        System.out.println("Size of the ArrayList:"+stringList.size());
        // Add elements to the ArrayList
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Cherry");
        stringList.add("Date");
        stringList.remove(3);
        stringList.add("Monir");
        stringList.set(0, "Numan");
        stringList.set(0, "Shahalam");
        stringList.add("Reza");
        stringList.add("Sayna");
        stringList.set(0, "Rodela");
        stringList.set(2, "Shamima");
        stringList.add("Shareka");

        // Print out the collection
        System.out.println(stringList);
        System.out.println("Size of the ArrayList:"+stringList.size());

        for (int i=0; i<stringList.size(); i++) {
            System.out.println(stringList.get(i));
        }
        
        stringList.clear();
		System.out.println(stringList);
    }
}
```

![ArrayListExam](https://github.com/tofayel143/Java-Basic/blob/main/Image/ArrayListExam.png)

#### 4. Java Program to Compare Two String Values Using a Condition

```java
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
```

![StringComporison](https://github.com/tofayel143/Java-Basic/blob/main/Image/StringComporison.png)

#### 5. Java Method to Perform Basic Arithmetic Operations

```java
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
```

![Java_mathod](https://github.com/tofayel143/Java-Basic/blob/main/Image/Java_mathod.png)

#### 6. Java Method to Call Arithmetic Operations from Another Class

```java
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
```

![Java_mathod_form_otherClass](https://github.com/tofayel143/Java-Basic/blob/main/Image/Java_mathod_form_otherClass.png)

## Best Practices

- Follow naming conventions (e.g., variables in camelCase, classes in PascalCase).
- Use meaningful variable and method names.
- Keep code organized and readable.
- Comment your code to explain its purpose.
