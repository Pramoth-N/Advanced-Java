/*
 * You are given an integer n. Your task is to generate and return the first n rows of Pascal's Triangle.
Input Format
• The input contains an integer n representing the number of rows to generate.
Output Format
• Print the representing Pascal's Triangle up to the nth row.
• If the input size n is less than or equal to 0 or greater than 15, print Invalid input.
Constraints
• -15 ≤ n ≤ 15.
 */


 import java.util.*;

class PascalsTriangle {
    public static void main(String args[]) {
        int num = new Scanner(System.in).nextInt();
        if(num < 1){
            System.out.println("Invalid input");
            return;
        }
        for(int i=0;i<num;i++){
            if(i+1<num)
            System.out.printf("%"+(num-i-1)+"s","");
            for(int j=0;j<=i;j++){
                System.out.print(factorial(i) / (factorial(i-j) * factorial(j)) + " ");
            }
            System.out.println();
        }
    }
    private static int factorial(int num){
        if(num == 0){
            return 1;
        }
        
        return num * factorial(num - 1);
    } 
}