/*
 * 
 * Sarah is planning to take a personal loan from her bank to renovate her house. The bank has a specific formula to calculate the total interest payable on the loan amount based on the rate of interest and the number of months. Sarah wants to automate this calculation to make her budgeting easier. Implement a program to help her calculate the total interest she needs to pay on her loan based on the user inputs of the principal loan amount, rate of interest, and duration in months.
Interest = PXRmXT
Input Format
• The first line contains an integer representing the principal amount.
• The second line contains an integer representing the loan term in months.
Output Format
• The output displays the total interest amount as a decimal number with exactly two decimal places.
• Print Invalid input if the principal is less than 0.
• Print -1 if the term is less than 1.
Constraints
• -1000 <= principal <= 1000000
• -100 <= term <= 360
Sample Input 1:
Sample Output 1:
10000
500.00
12
 * 
 */


 import java.util.Scanner;

public class LoanInterestCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int principal = sc.nextInt();
        
        if (principal < 0) {
            System.out.println("Invalid input");
            return;
        }
        int termInMonths = sc.nextInt();
        
        if (termInMonths < 1) {
            System.out.println("-1");
            return;
        }
        
        double rateOfInterest = 0.05;
        
        double totalInterest = principal * rateOfInterest * termInMonths / 12;
        
        System.out.printf("%.2f\n", totalInterest);
    }
}