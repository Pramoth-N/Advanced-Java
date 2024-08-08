/*
 * 
 * 
 * You are given three values, the principal amount, the rate of interest (in percentage), and the time period (in years). Your task is to calculate the simple interest based on the provided values using the formula:
Simple Interest
Principal x Ratex Time 100
Input Format
A floating-point number representing the principal amount.
• A floating-point number representing the rate of interest in percentage.
• A floating-point number representing the time period in years.
Output Format
• If all inputs are valid, print the simple interest formatted to decimal places.
• If any of the inputs are invalid negative values, print Invalid input.
Constraints
• 0 ≤ principal ≤ 10000
• -100 < rate ≤ 100
• 0 < time ≤ 100
 * 
 * 
 */

 import java.util.*;

class InterestCalculation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float n = sc.nextFloat();
        if(p < 0 || n < 0 || r < 0){
            System.out.print("Invalid input");
            return;
        }
        
        System.out.print(p * n * r / 100f);
    }
}