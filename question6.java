// Take user's
// name
// age
// Output
// Hello Suhani
// You are 21 years old.
package practicequestions;
import java.util.Scanner;

public class question6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age:");
        int age = input.nextInt();
        input.nextLine();
         
        System.out.print("Enter your Name: " );
        String name = input.nextLine();
         
         
        System.out.println("Hello " + name +" \nYou are " + age + " years old.");
        input.close();


        
 
    }
}

