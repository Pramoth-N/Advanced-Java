/*
 * 
 * Given a positive integer represented as a string, find the closest palindrome number to the given number. A palindrome number is a number that reads the same forwards and backwards. If there are two or more closest palindromes, return the smallest one.
Input Format
• The first line contains a string n, representing the integer.
Output Format
• If n is a palindrome, print the next closest palindrome.
• Print Invalid input, if the input is null, empty, or exceeds 18 characters in length.
Constraints
• 1 ≤ length of n ≤ 10
Sample Input 1:
121
Sample Output 1:
111
 * 
 */


import java.util.Scanner;

public class ClosestPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        
        if (!n.matches("[0-9]+")) {
            System.out.println("Invalid input");
            return;
        }
        
        long num = Long.parseLong(n);
        long smallerPalindrome = findSmallerPalindrome(num);
        long largerPalindrome = findLargerPalindrome(num);
        
        if (Math.abs(num - smallerPalindrome) <= Math.abs(num - largerPalindrome)) {
            System.out.println(smallerPalindrome);
        } else {
            System.out.println(largerPalindrome);
        }
    }
    
    private static long findSmallerPalindrome(long num) {
        num--;
        while (!isPalindrome(Long.toString(num))) {
            num--;
        }
        return num;
    }
    
    private static long findLargerPalindrome(long num) {
        num++;
        while (!isPalindrome(Long.toString(num))) {
            num++;
        }
        return num;
    }
    
    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }
}