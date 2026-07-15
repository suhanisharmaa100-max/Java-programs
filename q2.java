// Question 2: Calculator

// Take two integers from the user.

// Print:

// Sum
// Difference
// Product
// Quotient
// Remainder

// Example

// Enter first number: 20
// Enter second number: 5

// Sum = 25
// Difference = 15
// Product = 100
// Quotient = 4
// Remainder = 0


package day09javaBasics;

import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number:");
        int a = input.nextInt();

        System.out.print("Enter Second Number:");
        int b = input.nextInt();

        System.out.println("sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("Product = " + (a * b));
        System.out.println("Quotient = " + (a / b));
        System.out.println("Remainder = " + (a % b));
        input.close();

    }
     
}
