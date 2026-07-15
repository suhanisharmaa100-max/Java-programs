// Question 6: Wrapper Class

// Given:

// String age = "21";
// String salary = "50000.50";

// Convert them into:

// int
// double

// Then print:

// Age = 21
// Salary = 50000.5


package day09javaBasics;

public class q6 {
    public static void main(String[] args) {
        String age = "21";
        String salary = "50000.50";
        System.out.println("Age : " + (Integer.parseInt(age)));
        System.out.println("Salary : " + (Double.parseDouble(salary)));
    }
}
