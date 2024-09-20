/*
 * Given a string, analyze its reversed form to determine the number of uppercase characters and whether the reversed string is a palindrome.
Input Format
• A single-string input consisting of printable ASCII characters.
Output Format
• The reversed form of the input string.
• The number of uppercase letters in the reversed string.
• A boolean indicates if the reversed string is a palindrome, represented as true or false.
Constraints
• 1 ≤ length of input ≤ 1000
• The input string will contain only printable ASCII characters.
 */

 import java.util.*;

 class Palindrome {
     public static void main(String args[]) {
         
         String s = new Scanner(System.in).next();
         
         StringBuilder sb = new StringBuilder(s);
         int count = 0;
         for(char c : s.toCharArray()) {
             if(Character.isUpperCase(c)){
                 ++count;
             }
         }
         sb.reverse();
         
         System.out.println( sb );
         System.out.println( count );
         System.out.println( sb.toString().equalsIgnoreCase(s) );
     }
 }