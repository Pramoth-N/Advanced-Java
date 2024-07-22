/*
 Given a single character input, Find and display its ASCII value. 
 If the input is not a valid single character, display an appropriate error message.
Input Format
• The input consists of a single character.
Output Format
• If the input is a valid single character, output the ASCII value of the character.
• If the input is not a valid single character, print"Invalid input".
Constraints
• The input will be a single character.
• The character must be a printable ASCII (32 <= ASCII value <= 126).
 */

import java.util.Scanner;

public class ASCIIConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.length()>1)
        {
            System.out.print("Invalid input");
        } else {
            System.out.print((int)c.charAt(0));
        }
    }
}