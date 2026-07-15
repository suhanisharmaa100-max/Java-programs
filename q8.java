// Question 8: Multi-Dimensional Array

// Create this array:

// int[][] marks = {
//     {80,75,90},
//     {65,70,85},
//     {95,88,91}
// };

// Print:

// First student's marks
// Second student's second subject
// Third student's third subject

// Finally print the entire array using:

// Arrays.deepToString()

package day09javaBasics;

import java.util.Arrays;

public class q8 {
    public static void main(String[] args) {
        int[][] marks = {
    {80,75,90},
    {65,70,85},
    {95,88,91}
    };
    System.out.println("First student's marks: "+Arrays.toString(marks[0]));
    System.out.println("Second student's second subject: "+marks[1][1]);
    System.out.println(("Whole array:"+marks[2][2]));
    }
}
