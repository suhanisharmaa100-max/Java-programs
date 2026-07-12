//=================arithmetic op.=========
// package day06javaBasics;

// public class arithmeticop {
//     public static void main(String[] args) {
//         int a = 2;
//         int b = 3;
//         //addition
//         System.out.println("addition:" +(a+b));
//         //Subtraction
//         System.out.println("Subtraction:" +(a-b));
//         //Multiplication
//         System.out.println("Multiplication:" + (a*b));
//         //Division
//         System.out.println("Division:" + (a/b));
//         //Modulus (Remainder)
//         System.out.println("Remainder:" + (a%b));
//         //increment
//         // a++; // 2+3 = 5  then 5 +1 = 6 
//         // System.out.println(a+b);
//         // after commenting above 
//         // ++a; // 2+1(increment)=3 then 3-3 = 0
//         // System.out.println(a-b);
//         //decrement
//         // a--; // 2+3=5 then 5-1=4
//         // System.out.println(a+b);
//         //after commenting above
//         // --a; // 2-1=1 then 1-3 = -2
//         // System.out.println(a-b);


//     }
// }
//========order of operations=========
package day06javaBasics;

public class arithmeticop {
    public static void main(String[] args) {
         int calculate = 10 + 3 *2;
         //with paranthesis 
         calculate = (10 + 3) * 2;
         System.out.println("CALCULATION:" + calculate); 
    }
}