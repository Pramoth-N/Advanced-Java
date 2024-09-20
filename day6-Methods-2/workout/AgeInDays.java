/*
 * You are given a person's age in years. Your task is to calculate the person's age in days, assuming that each year has 365 days.
Input Format
• The input consists of a single integer age in a year.
Output Format
• The program prints the age in days as an integer.
• If the input is invalid negative or non-integer, print Invalid input.
Constraints
• -100 ≤ agelnYears ≤ 100
• If the input is any ASCII values
 */

 import java.util.*;

 class AgeInDays {
     public static void main(String args[]) {
         int age;
         try {
             age = new Scanner(System.in).nextInt();
         } catch(NoSuchElementException ex) {
             System.out.println("Invalid input");
             return;
         }
         if(age < 1){
             System.out.println("Invalid input");
         } else {
             System.out.println( age * 365 );
         }
     }
 }