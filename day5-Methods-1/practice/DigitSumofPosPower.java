/*
 * 
 * Given a positive integer n, you need to calculate the sum of its digits each raised to the power of their respective positions. The positions are counted starting from 1 for the least significant digit.
Input Format
• The input consists of a single integer.
Output Format
• Print a single integer which is the sum of the digits of n raised to the power of their respective positions.
• If the integer is less than 1, print Invalid input.
Constraints
• -103 ≤ n ≤ 103
 * 
 */

 import java.util.*;

class DigitSumofPosPower {
    public static void main(String args[]) {
        int num = new Scanner(System.in).nextInt();
        if(num<=0){
            System.out.println("Invalid input");
            return;
        }
        System.out.println(digitPowSum(num));
    }
    private static int digitPowSum(int num){
        int power = 1 , digitSum = 0;
        while(num>0){
            digitSum += Math.pow(num%10,power++);
            num/=10;
        }
        return digitSum;
    } 
}