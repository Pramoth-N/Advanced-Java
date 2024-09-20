/*
 * 
 * You are given information about multiple stocks that you have purchased and sold. For each stock, you have the purchase price, sale price, and quantity of shares. Your task is to calculate the capital gain or loss for each stock.
Input Format
• The first line contains an integer n, the number of stocks.
• A double purchasePrice the purchase price of the stock.
• A double salePrice the sale price of the stock.
• An integer quantity is the quantity of the stock.
Output Format
• If the capital gain amount is rounded to decimal places.
• If the capital loss amount is rounded to decimal places.
• If there is no gain or loss, print "No Gain or Loss".
Constraints
• 1 ≤ numberOfStocks ≤ 1000
• 0.0 ≤ purchasePrice ≤ 106
• 0.0 ≤ salePrice ≤ 106
• 1 ≤ quantity ≤ 104
 * 
 */


import java.util.*;

class StockMarket {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-- > 0){
            double purchase = sc.nextDouble();
            double sale = sc.nextDouble();
            int quantity = sc.nextInt();
            
            double amt = quantity * (sale - purchase);
            if(amt == 0){
                System.out.printf("%s%n","No Gain or Loss");
            } else {
                System.out.printf("%.2f%n",Math.abs(amt));
            }
        }
    }
}