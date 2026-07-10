//===============================OLD WAY OF CREATING AN ARRAY======
//======================integer=================

// package day04javaBasics;

// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         int[] numbers = new int[5];
//         //valid index (0,1)
//         numbers[0] = 1;
//         numbers[1] = 2;
//         //invalid index (10)
//         // numbers[10] = 3; //output - exception error
//         // if we print index 0 , 1 only 
//         // System.out.println(numbers); // output - [I@4517d9a3
//         // System.out.println(Arrays.toString(numbers));
//         System.out.println(Arrays.toString(numbers));
        
//     }
 
// }


//===================boolean=================

// package day04javaBasics;

// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         boolean[] numbers = new boolean[5];
//         numbers[0] =  true;
//         numbers[1] = true;
//         System.out.println(Arrays.toString(numbers));
        
//     }
 
// }


//=================String array==============

// package day04javaBasics;

// import java.util.Arrays;

// public class Array {
//     public static void main(String[] args) {
//         String[] numbers = new String[5];
//         numbers[0] =  "hello";
//         numbers[1] = "suhani";
//         System.out.println(Arrays.toString(numbers));
        
//     }
 
// }


//===============New syntax for Array==============

//==============find length===========

// package day04javaBasics;


// public class Array {
//     public static void main(String[] args) {
//         int[] numbers = {2,3,5,1,4};
         
//         System.out.println(numbers.length);
        
//     }
 
// }

//=========sort an array==========


package day04javaBasics;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 1, 4};
        Arrays.sort(numbers);
         
        System.out.println(Arrays.toString(numbers));
        
    }
 
}
