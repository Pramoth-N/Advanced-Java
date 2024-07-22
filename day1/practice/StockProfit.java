/*
 * Given an array of integers representing a company's stock prices for 'n' consecutive days, 
 * calculate the maximum profit that can be made by buying and then selling the stock on different days. 
 * Additionally, calculate the profit percentage based on the initial stock price. 
 * Your task is the number of days 'n' and the stock prices for each day, and then output the maximum profit and the profit percentage.
Input Format
• The first line contains an integer 'n' (number of days).
The second line contains n integers representing the stock prices for each day.
Output Format
• The first line contains an integer representing the maximum profit.
• The second line contains a floating-point number (up to two decimal places) representing the profit percentage.
• If the input 'n' is a negative integer, print "Invalid input".
Constraints
• -100 ≤ n ≤ 100
• -1000 < price < 1000
 */

 import java.util.*;

class StockProfit{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid input");
            sc.close();
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        sc.close();
        int min = arr[0];
        int max =arr [0],profit =0;
        for(int i=1;i<n;i++)
        {
            if(arr[i]>min)
            {
                if(profit < arr[i] - min)
                {
                    profit = arr[i]-min;
                    max = arr[i];
                }
            }
            else{
                min = arr[i];
            }
        }
        System.out.println(profit);
        System.out.printf("%.2f",profit*100f/arr[0]);
    }
}