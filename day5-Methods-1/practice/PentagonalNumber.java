/*
 * A pentagonal number is a figurate number that extends the concept of triangular and square numbers to the pentagon. The formula to compute the nth pentagonal number is given by:
Pn = n(3n-1)/2
Input Format
• The input consists of an integer n, where n is the index of the pentagonal number starting from 1.
Output Format
• Print the first n pentagonal numbers, each on a new line.
• If n is less than 1, print -1.
Constraints
• -102 <= n 102
 */


 import java.util.*;

class PentagonalNumber {
    public static void main(String args[]) {
        int num = new Scanner(System.in).nextInt();
        if(num < 1){
            System.out.println("-1");
            return;
        }
        pentagonalNumer(num);
    }
    private static void pentagonalNumer(int num){
        if(num>1){
            pentagonalNumer(num-1);
        }
        System.out.println( (num * (3*num -1 )) / 2);
    } 
}