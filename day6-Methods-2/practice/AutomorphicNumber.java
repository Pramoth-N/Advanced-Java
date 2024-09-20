/*
 * 
 * Given an integer, determine if it is an automorphic number. An automorphic number is a number whose square ends with the number itself. For example, 25 is an automorphic number because 252 = 625 ends in 25.
Input Format
• If the input contains the integer number to check for being an automorphic number.
Output Format
• If the integer is automorphic, print 'num' is an Automorphic number.
• If the integer is not automorphic, print 'num' is not an Automorphic number.
• If the input is invalid a negative number or non-integer, print Invalid input.
Constraints
• -104 ≤ num ≤ 104
• The input string will contain only printable ASCII characters
 * 
 */


 import java.util.*;

 class AutomorphicNumber {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         if(!sc.hasNextInt()){
             System.out.println("Invalid input");
             return;
         }
         int n = sc.nextInt();
         if(n<0){
             System.out.println("Invalid input");
         } else if(isAutomorphic(n)) {
             System.out.println(n  + " is an Automorphic number");
         } else {
             System.out.println(n  + " is not an Automorphic number");
         }
     }
     
     private static boolean isAutomorphic(int n){
         String sq = Integer.toString(n*n);
         String num = String.valueOf(n);
         
         if(num.equals(sq.substring(sq.length()-num.length())))
         return true;
         return false;
     }
     
 }