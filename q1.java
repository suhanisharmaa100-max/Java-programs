// Question 1

// Create the following 2D array:

// int[][] numbers = {
//     {10, 20},
//     {30, 40}
// };

// Print:

// 10
// 40
package day10javaBasics;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int [] []  numbers = {
            {10,20},
            {30,40}
        };
        System.out.println(Arrays.deepToString(numbers));
        System.out.println("first number:" + numbers [0][0]);
        System.out.println("first number:" + numbers [1][1]);
        
    }
}
