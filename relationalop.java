package day07javaBasics;

public class relationalop {
    public static void main(String[] args) {
        int a = 15;
        int b = 10;
        int c = 5;
        // is a equal to b ?= false
        System.out.println("equal to(a == b) : " + (a == b ));
        // is a not equal to c? = true
        System.out.println("not equal to(a != c) : " + (a != c));
        //is a greater than c? = true
        System.out.println("greater than(a > c) : " + (a > c));
        //is a less than b? = false
        System.out.println("less than(a < b) : " + (a < b));
        // is a greater than or equal to b ? = true
        System.out.println("greater than or equal to(a >= b) : " + (a >= b));
        //is a less than or equal to c? = false 
        System.out.println("less than or equal to(a <= c) :" + (a <= c));
    }
}
