// Question 5: Type Casting

// Take a double from the user.

// Convert it into an int.

// Example

// Enter price: 199.99

// Integer Value = 199


package day09javaBasics;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter price: ");
        double price = input.nextDouble();

        System.out.println("intger value: " + ((int) price));
        input.close();
    }
}
