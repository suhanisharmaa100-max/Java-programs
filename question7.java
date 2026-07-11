// Take two integers from the user.
// Print
// Sum
// Difference
// Product

// Example
// Enter first number : 10
// Enter second number : 5
// Sum = 15
// Difference = 5
// Product = 50

package practicequestions;

import java.util.Scanner;

public class question7 {
    public static void main(String[] args) {
         
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first number: " );
        int a = input.nextInt();
         

        System.out.print("Enter your second number: " );
        int b = input.nextInt();

        System.out.println("sum = " + (a + b));
        System.out.println("Difference = " + (a - b));
        System.out.println("product = " + (a * b));
        input.close();

    }
    
}

