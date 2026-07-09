//=======================================NON-PRIMITIVE DATATYPE=========================================================

//=============================================STRING================================================ 
package day03javaBasics;

public class Nonprimitive {
    public static void main(String[] args) {
        
    
    String message = "  Hello! my name is Suhani  ";
    System.out.println(message);
    //methods of string 
    //endsWith() - show ends of string 
    System.out.println(message.endsWith("i"));
    //startsWith() - shows starting of string
    System.out.println(message.startsWith("h"));
    //length()- shows length of string 
    System.out.println(message.length());
    //indexOf()-finds the position of a character or piece of text inside a String.
    System.out.println(message.indexOf("i"));
    //toLowerCase - convert all character to lowercase.
    System.out.println(message.toLowerCase());
    //toUpperCase - convert all character to uppercase.
    System.out.println(message.toUpperCase());
    //replace(target:"", replacement:"")-replace one or more characters with something else.
    System.out.println(message.replace("my" , "namaste my"));
    //trim()- get rid of extr white space (at beginning or end of a string )
    System.out.println(message.trim());

    }
}

