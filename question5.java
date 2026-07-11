// Swap two variables using a third variable.
// Input
// a = 10
// b = 20
// Output
// Before Swap
// a = 10
// b = 20
// After Swap
// a = 20
// b = 10

package practicequestions;

public class question5 {
    public static void main(String[] args) {

        // Before swap
        int a = 10;
        int b = 20;

        System.out.println("Before Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swap");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }
    
}
