/*
 * A triangular number or triangle number is a number that can be represented as a triangle with dots. The n-th triangular number is the sum of the first n natural numbers. For example, the 4th triangular number is 1+ 2+ 3+ 4 = 10.
Tn = nx(n+1) 2
Input Format
• An integer n, represents the position of the triangular number to calculate.
Output Format
• The number of digits in the n-th triangular number.
• If the integer is less than 1, print Invalid input.
Constraints
• -10 ≤ n ≤ 104
 */

 import java.util.*;

 class TriangularNumber {
     public static void main(String args[]){
         int n = new Scanner(System.in).nextInt();
         if(n<=0){
             System.out.println("Invalid input");
             return;
         }
         System.out.println(digitsInNthTrianglularNumber(n));
     }
     
     private static int digitsInNthTrianglularNumber(int num){
         int n = nthTrianglularNumber(num);
         int len = 1;
         while((n/=10) > 0){
             len++;
         }
         return len;
     }
     private static int nthTrianglularNumber(int num){
         return (num * (num + 1)) / 2;
     }
 }