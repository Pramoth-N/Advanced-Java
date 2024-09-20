/*
 * 
 * You are given two positive integers. Implement a method to calculate the Least Common Multiple (LCM) of these integers using their Greatest Common Divisor (GCD). The LCM is the smallest positive integer that is divisible by both numbers.
Input Format
• The input consists of two integers num1 and num2.
Output Format
• The LCM of the two integers.
• If any input is negative integer or zero, print Invalid input.
Constraints
• -104 <= a, b <= 104
 * 
 */


 import java.util.*;

 class LCM {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int m = sc.nextInt();
         if(n<=0 || m<=0){
             System.out.println("Invalid input");
         } else {
             System.out.println(calculateLCM(n,m));
         }
     }
     
     private static int calculateLCM(int n , int m){
         
         int gcd = calculateGCD(n,m);
         
         return (n*m) / gcd;
     }
     
     private static int calculateGCD(int n , int m){
         while(m!=0){
             int t = m;
             m = n % m;
             n = t;
         }
         return n;
     }
 }