/*
 * 
 * A Smith Number is a composite number for which, in a given number base, the sum of its digits is equal to the sum of the digits in its prime factorization. In this problem, you are given an integer num and you need to determine if it is a Smith Number.
Input Format
• An integer num represents the number to be checked.
Output Format
• If num is a Smith number, print "1".
• If num is not a Smith number, print "o".
• If num is less than 1 or a non-integer, print "Invalid input".
Constraints
• -104 <= num <= 104
Explanation
• 378 is not prime. Its digit sum (3+7+8=18) matches the sum of its prime factors digits (2+3+3+3+7 = 18), confirming it as a Smith number.
 * 
 */

 import java.util.*;

 class SmithNumber {
     public static void main(String args[]){
         int num; 
         try{
             num = new Scanner(System.in).nextInt();
         }catch(InputMismatchException ex){
             System.out.println("Invalid input");
             return;
         }
         if(num<1){
             System.out.println("Invalid input");
             return;
         }
         if(isSmithNumber(num))
         System.out.println(1);
         else
         System.out.println(0);
     }
     
     private static boolean isSmithNumber(int num){
         return digitSum(num) == factSum(num);
     }
     private static int digitSum(int num){
         if(num>0){
             return num%10 + digitSum(num/10);
         }
         return 0;
     }
     
     private static int factSum(int num){
         int sum =0;
         for(int i=2;i<=num;i++){
             while(num%i == 0){
                 sum+=digitSum(i);
                 num/=i;
             }
         }
         return sum;
     }
 }