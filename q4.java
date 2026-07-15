// Question 4: Logical Operators

// Take:

// Age
// Whether the user has an ID (true/false)

// Print:

// Eligible = true

// Condition:

// Age >= 18 AND hasID == true


package day09javaBasics;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter your age: ");
        int age = input.nextInt();

        System.out.print("hasID: (true/false) ");
        boolean hasID = input.nextBoolean();

        System.out.println("eligible : " + (age >= 18 && hasID == true));
        //or 
        System.out.println("eligible : " + (age >= 18 && hasID));// both have same meaning
        input.close();
    }
}
