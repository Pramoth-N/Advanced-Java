/*
 * 
 * You are given a set of rectangles, each defined by a length and a width. Implement a class Rectangle that can calculate the total area of these rectangles based on the provided inputs.
Input Format
• The first line represents the number of rectangles.
• Each subsequent line represents the length and width of each rectangle.
Output Format
• The output should be a single line containing the total area of all rectangles.
• If any length or width is a negative integer, print Invalid input.
Constraints
• -104 < length, width < 104
 * 
 */


 import java.util.*;

 class RectangleArea {
     public static void main(String args[]) {
         
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         double area = 0;
         
         for(int i=0;i<n;i++){
             double l = sc.nextDouble();
             double w = sc.nextDouble();
             if(l<0 || w<0){
                 System.out.println( "Invalid input" );
                 return;
             }
             area += l*w;
         }
         
         System.out.println( area );
     }
 }