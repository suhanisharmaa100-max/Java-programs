// Question 3

// Create the following 2D array:

// String[][] names = {
//     {"Suhani", "Ayush"},
//     {"Riya", "Rahul"}
// };

// Print:

// Suhani
// Rahul
package day10javaBasics;

import java.util.Arrays;

public class q3 {
    public static void main(String[] args) {
            String [] [] name  = {
            {"Suhani", "Ayush"},
            {"Riya","Rahul"}
        };
        System.out.println("names of students: " + Arrays.deepToString(name));
        System.out.println(name[0][0]);
        System.out.println(name[1][1]);
    }
}
