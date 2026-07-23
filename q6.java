// Question 3: Shopping Bill

// Take:

// Product name
// Quantity
// Price per item

// Print:

// Total Bill
package day10javaBasics;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner (System.in);
    System.out.print("enter product name:");
    String name = input.nextLine();

    System.out.print("Quantity:");
    int num = input.nextInt();

    System.out.print("Price per item:");
    double price = input.nextDouble();

    System.out.println("total bill of "+ name + ":"  + (num * price));
    input.close();
    }
}
