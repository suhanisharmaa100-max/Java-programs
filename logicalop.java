package day07javaBasics;

public class logicalop {
    public static void main(String[] args) {
        int a = 10;
        int b = 15;
        int c = 20;
        //logical AND (condition 1 : true , condition 2 : true then result: true)
        System.out.println("logical And (&&) : " + ((a < b ) && (b < c)));
        //logicl OR (condition 1 : true , condition 2 : false then result: true)
        System.out.println("logical OR (||) : " + ((a < b ) || (b < a)));
        //logical NOT (condition 1 : false then result: true)
        System.out.println("logical NOT (!) : " + (!(b < a)));
    }
    
}
