/*
 * Given an integer n, your task is to calculate the factorial of n. The factorial of an integer n is the product of all positive integers less than or equal to n.
Input Format
• A single integer n represents the number for which the factorial is to be calculated.
Output Format
• Print the factorial of the given integer n.
• If the input is negative, print Invalid input.
Constraints
• The integer n will be within the range of -20 to 20.
 */

 import java.util.*;

 class Factorial {
     public static void main(String args[]){
         int num; 
         try{
             num = new Scanner(System.in).nextInt();
         }catch(InputMismatchException ex){
             System.out.println("Invalid input");
             return;
         }
         if(num<0){
             System.out.println("Invalid input");
             return;
         }
         System.out.println(factorial(num));
         
     }
     
     private static int factorial(int num){
         if(num>1){
             return num * factorial(num-1);
         }
         return 1;
     }
 }