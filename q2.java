// Question 2

// Create the following 2D array:

// int[][] marks = {
//     {80, 75, 90},
//     {65, 70, 85}
// };

// Print:

// 75
// 65
// 90
package day10javaBasics;

import java.util.Arrays;

public class q2 {
    public static void main(String[] args) {
        int [] [] number = {
            {80, 75, 90},
            {65, 70, 85}
        };
        System.out.println("Given Array:" + Arrays.deepToString(number));
        System.out.println("frist element:" + number[0][1]);
        System.out.println("Second element:" + number[1][0]);
        System.out.println("Third element:" + number[0][2]);
    }
}
