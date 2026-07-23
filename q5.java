// Question 2: Circle Calculator

// Take the radius from the user.

// Declare:

// final double PI = 3.14159;

// Print:

// Area
// Circumference
package day10javaBasics;

import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
    
    final double PI = 3.14159;
    Scanner input = new Scanner(System.in);
    System.out.print("enter circle's radius:");
    int r = input.nextInt();
    System.out.println("Area Of Circle:" + (PI*r*r));
    System.out.println("circumference of circle:" + (2*PI*r));
    input.close();
    }
}
