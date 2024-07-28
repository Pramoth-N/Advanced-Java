/*
 * 
 * Given a base class Food with derived classes Fruit, Vegetable, and Dairy, 
 * each representing a type of food with a specific quantity and calories per unit, 
 * implement a function to calculate the total calories for all the given food items.
Input Format
• The first line contains an integer numItems representing the number of food items.
• Each of the following lines contains a string type representing the type of food ('Fruit', 'Vegetable', 'Dairy'), 
followed by two integers representing quantity and calories respectively.
Output Format
• If quantity or calories are less than 0, print -1.
• If the type is not one of 'Fruit', 'Vegetable', or 'Dairy', print 'Invalid input'.
• Otherwise, print the total calories as an integer.
Constraints
• 1≤ numitems ≤ 20
• -100 < quantity < 100
• -100 < calories < 100
 * 
 */


 import java.util.*;

 class Food {
     public String type;
     public int quantity;
     public int calorie;
     
     public Food(String type , int quantity ,int calorie) {
         this.type = type;
         this.quantity = quantity;
         this.calorie = calorie;
     }
 }
 class Fruit extends Food{
     public Fruit(String type , int quantity ,int calorie) {
         super(type ,quantity ,calorie);
     }
 }
 class Vegetable extends Food{
     public Vegetable(String type , int quantity ,int calorie) {
         super(type ,quantity ,calorie);
     }
 }
 
 class Dairy extends Food{
     public Dairy(String type , int quantity ,int calorie) {
         super(type ,quantity ,calorie);
     }
 }
 
 class Solution {
     public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         int totalCalories = 0;
         for(int i=0;i<n;i++) {
             String type = sc.next();
             int nos = sc.nextInt();
             int cal = sc.nextInt();
             
             if(nos < 0 || cal < 0) {
                 System.out.print(-1);
                 return ;
             }
             
             Food food;
             switch(type){
                 case "Fruit" :
                     food = new Fruit(type ,nos ,cal);
                     break;
                 case "Vegetable" :
                     food = new Vegetable(type ,nos ,cal);
                     break;
                 case "Dairy" :
                     food = new Dairy(type ,nos ,cal);
                     break;
                 default :
                     System.out.print("Invalid input");
                     return;
             }
             
             totalCalories += nos*cal;
         }
         
         System.out.print(totalCalories);
     }
 }