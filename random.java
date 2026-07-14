package day08javaBasics.mathClass;

public class random {
    public static void main(String[] args) {
        // b/w 0 to 1
        // double result = Math.random();
        // b/w 0 to 100
        // double result = Math.random() * 100;
        // round this number reduce digits after decimal 
        // double result = Math.round(Math.random() * 100);
        //cast it to an int example
        // int result = (int) Math.round(Math.random() * 100);
        // without round method 
        // int result = (int) Math.random() * 100;  // 0 
        //use parenthesis ( )
        int result = (int) (Math.round(Math.random() * 100));

 
        System.out.println(result);
    }
}
