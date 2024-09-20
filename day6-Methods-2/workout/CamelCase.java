/*
 * You are given a string consisting of alphabetic characters and spaces. Your task is to capitalize the first letter of each word in the string. A word is defined as a sequence of alphabetic characters separated by spaces. You should also ensure that the input string only contains alphabetic characters and spaces.
Input Format
• A single line containing a string with alphabetic characters and spaces.
Output Format
• A line containing the input string with each word's first letter capitalized.
• The hash code of the input string object.
• If the input string contains any non-alphabetic characters, print "Invalid input".
Constraints
• The length of the input string will be between 0 and 104.
 */


 import java.util.*;

class CamelCase {
    public static void main(String args[]) {
        
        String s = new Scanner(System.in).nextLine();
        if(!s.matches("[a-zaA-Z ]*")){
            System.out.println( "Invalid input" );
            return;
        }
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String word : words) {
            sb.append(Character.toUpperCase(word.charAt(0)) + word.substring(1) + " ");
        }
        
        System.out.println( sb.toString().trim() );
        System.out.println(s.hashCode());
        @Override
    }
}