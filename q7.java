// Question 7: Arrays

// Create an integer array:

// {10,20,30,40,50}

// Print:

// Entire array
// First element
// Last element

// Then change the third element to 100.

// Print the updated array.


package day09javaBasics;

import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {
        int [] numbers = {10,20,30,40,50};
        System.out.println("entire array: " + Arrays.toString(numbers));
        System.out.println("first element: " + numbers[0]);
        System.out.println("last element: " + numbers[4]);
        numbers[2] = 100;
System.out.println("Updated array: " + Arrays.toString(numbers));
    }
}
