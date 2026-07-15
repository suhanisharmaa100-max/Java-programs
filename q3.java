// Question 3: Comparison Checker

// Take two integers from the user.

// Print the result of:

// ==
// !=
// >
// <
// >=
// <=

// Example

// Enter first number: 10
// Enter second number: 20

// Equal: false
// Not Equal: true
// Greater: false
// Less: true
// Greater or Equal: false
// Less or Equal: true

package day09javaBasics;

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = input.nextInt();

        System.out.print("Enter Second Number: ");
        int b = input.nextInt();

        System.out.println("EQUAL:" + (a == b));
        System.out.println("NOT EQUAL:" + (a != b));
        System.out.println("GREATER:" + (a > b));
        System.out.println("LESS:" + (a < b));
        System.out.println("GREATER OR EQUAL:" + (a >= b));
        System.out.println("LESS OR EQUAL:" + (a <= b));
        input.close();

    }
}
