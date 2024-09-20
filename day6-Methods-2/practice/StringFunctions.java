/*
 * 
 * You are given a string and a set of commands. Implement a method to convert the case of the string based on the commands provided. For each command, convert the entire string to either lowercase or uppercase as specified.
Input Format
• A single line containing a string inputstring, which represents the string to be converted.
• Each command can be either lower Of upper.
Output Format
• Print the resulting string after applying the case conversion.
• If a command is invalid, print Invalid input.
Constraints
• The input string consists of printable ASCII characters.
• 1 ≤ inputString ≤ 1000
 * 
 */


 import java.util.*;

class StringFunctions {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        String condition = sc.next();
        
        if(condition.equals("lower")){
            System.out.println(s.toLowerCase());
        } else if(condition.equals("upper")) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println("Invalid input");
        }
    }
}