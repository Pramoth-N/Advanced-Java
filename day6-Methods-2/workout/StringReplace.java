/*
 * 
 * You are given a string text and a target word target to be replaced in the string. Your task is to replace every occurrence of the target word with a list of replacement words in the given order. After applying all replacements, print the original and modified text.
Input Format
• A string text representing the original text.
• A string target represents the word to be replaced.
• A comma-separated list of strings representing the replacement words.
Output Format
• The output should be a single string showing both the original text and the modified text.
Constraints
• 1 < text < 1000
• 1 ≤ target ≤ 100
• 1 ≤ replacements≤ 100
 * 
 */


 import java.util.*;

 class StringReplace {
     public static void main(String args[]) {
         
         Scanner sc = new Scanner(System.in);
         try {
             String s = sc.nextLine();
             String target = sc.nextLine();
             String replacement = sc.nextLine();
             String[] words = replacement.split(",");
             for(int i=words.length -1 ;i>0;i--){
                 words[i-1] = words[i-1].replace(target,words[i]);
             }
             System.out.println( s );
             System.out.println( s.replace( target , words[0] ) );
         }catch(NoSuchElementException ex){
             System.out.println( "Invalid input" );
         }
     }
 }