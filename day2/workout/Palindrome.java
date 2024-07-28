/* 
 You are given a string and need to determine whether it is a palindrome. 
 A string is considered a palindrome if it reads the same forwards and backwards 
 when non-alphanumeric characters are removed and the remaining characters are converted to lowercase.
Input Format
• A single string inputstring consists of alphanumeric characters and spaces.
Output Format
• If the input string is a palindrome, print: The string is a palindrome.
• If the input string is not a palindrome, print: The string is not a palindrome.
• If the input string contains any invalid characters, print: Invalid input.
Constraints
The input string has a length between 1 and 104.
*/


import java.util.*;

class Palindrome {
    public static void main(String args[]) {
        String s =  new String();
        try{
        s = new Scanner(System.in).nextLine();
        }catch(Exception ex) {
                System.out.println("Invalid input");
                return ;
        }
        StringBuilder  str = new StringBuilder();
        
        for(char c : s.toCharArray()) {
            if(Character.isAlphabetic(c) || Character.isDigit(c)) {
                str.insert(0,c);
            } else if(c !=' ') {
                System.out.println("Invalid input");
                return;
            }
        }
        
        s=s.replaceAll(" ","");
        if(s.equalsIgnoreCase(str.toString())) {
                System.out.println("The string is a palindrome");
        } else {
                System.out.println("The string is not a palindrome");
        }
    }
}