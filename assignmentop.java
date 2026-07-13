package day07javaBasics;

public class assignmentop {
    public static void main(String[] args) {
        // a is assigned 10
        int a = 10;
        System.out.println("Assignment: " + a);
        // now a 10 frist we add 5 in 10 that is 15 and then assign a = 15.
        a += 5;
        System.out.println("Add and Assign: " + a);
        // now a = 15 , first we subtract 3 from 15 we get 12 and then assign a = 12.
        a -= 3;
        System.out.println("Subtract and Assign:" + a);
        //now a = 12 ,first we multiply 12 by 2 we get 24 and then assign a = 24.
        a *= 2;
        System.out.println("Multiply and Assign: " + a);
        // now we have a = 24 , first we divide 24 by 3 we get 8 and then we assign a = 8.
        a /= 3;
        System.out.println("Divide and Assign: " + a);
        // now a=8 now we find the reminder that my friend is 0 and now we assign a = 0 (dividend=8, divisor=4, quotient=2, remainder=0)
        a %= 4;
        System.out.println("Modulus and Assign: " + a);


    }
}
