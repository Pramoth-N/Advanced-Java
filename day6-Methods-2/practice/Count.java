/*
 * 
 * Given an integer array, implement a function to count the number of negative elements in the array.
Input Format
• The first line contains an integer n representing the size of the array.
• The next n lines each contains integer, representing the elements of the array.
Output Format
• A single integer represents the count of negative elements in the array.
• If the input n negative integer or elements contains characters, print Invalid input.
Constraints
• -104 ≤ n ≤ 104
• -1000 ≤ element ≤ 1000
• The input contains only printable ASCII characters.
 * 
 */

 import java.util.*;

 class StockMarket {
     public static void main(String args[]){
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         if(n<=0){
             System.out.println("Invalid input");
             return;
         }
         int count = 0;
         while(n-- > 0){
             
             try{
                 if(sc.nextInt()<0){
                     ++count;
                 } 
             } catch(NoSuchElementException ex){
                 System.out.println("Invalid input");
                 return;
             }
         }
         System.out.println( count );
     }
 }