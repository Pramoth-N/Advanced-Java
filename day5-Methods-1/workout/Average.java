/*
 * Given a list of numbers, your task is to calculate the average of these numbers. First input the number of values to average, implement a function to compute and print the average of the values.
Input Format
• The first line contains an integer n, representing the number of values.
• The next n lines contain double values, representing the numbers to be averaged.
Output Format
• Print a single double value, which is the calculated average of the given values, rounded to single decimal places.
• If the input n is a negative number or if any input is non-integer, print Invalid input.
Constraints
• -100 ≤ n ≤ 100
• Input can be any ASCII characters
 */

 import java.util.*;

 class Average {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
            if(n<=0){
                System.out.println("Invalid input");
                return;
            }
            double[] nums = new double[n];
            for(int i=0;i<n;i++){
                    nums[i] = sc.nextDouble();
            }
            System.out.println(avg(nums));
        }catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
    }
    
    private static double avg(double[] nums){
        double sum = 0;
        for(double x : nums){
            sum+=x;
        }
        return sum / nums.length;
    }
}