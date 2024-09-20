/*
 * You are given an integer n, and you need to calculate the harmonic sum of the first n positive integers. The harmonic sum is defined as the sum of the reciprocals of the first n positive integers.
Σ=1+1/2+1/3+1/4+...
Input Format
• An integer n represents the number of terms to include in the harmonic sum.
Output Format
• If n is valid, return the harmonic sum up to two decimal places.
• If n is less than 1, return "-1".
Constraints
• -50 <= input <= 50
 */

 import java.util.*;

class HarmonicSum {
    public static void main(String args[]){
        int num; 
        try{
            num = new Scanner(System.in).nextInt();
        }catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
        if(num<1){
            System.out.println(-1);
            return;
        }
        System.out.printf("%.2f",harmonicSum(num));
        
    }
    
    private static double harmonicSum(int num){
        double sum = 0;
        for(int i=1;i<=num;i++){
            sum+=1d/i;
        }
        return sum;
    }
}