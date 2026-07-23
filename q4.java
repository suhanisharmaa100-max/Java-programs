// Question 1: Student Information

// Take input from the user:

// Name
// Age
// CGPA

// Declare a constant COLLEGE.

// Print all the details.
package day10javaBasics;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        final String COLLEGE = "Abc" ;
        Scanner input = new Scanner(System.in);
        System.out.print("enter your name:" );
        String name = input.nextLine();

        System.out.print("enter your age: ");
        int AGE = input.nextInt();

        System.out.print("enter your CGPA:");
        Double CGPA = input.nextDouble();


        System.out.println("details of " + name + " the student of " + COLLEGE + ":"); 

        System.out.println("Age: " + AGE);
        System.out.println("CGPA: " + CGPA);
        input.close();
    }
}
