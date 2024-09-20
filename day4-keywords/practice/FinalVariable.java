/*
 * 
 * Given a number of iterations, you need to implement a function that performs a loop for the specified number of iterations and tracks the total number of iterations across multiple function calls using a static variable.
Input Format
• An integer n represents the number of iterations.
Output Format
• For each iteration from 1 to the number of Iterations, print the iteration count in the
format: Iteration: n, where n is the iteration number.
• Print Invalid input, if non-numerical inputs present or n is a negative.
Constraints
-100 <= n <= 100
 * 
 */


 import java.util.*;

class FinalVariable {
    public static void main(String args[]) {
        final int n;
        try{
            n = new Scanner(System.in).nextInt();
        } catch(Exception ex) {
            System.out.println("Invalid input");
            return;
        }
        if(n<=0){
            System.out.println("Invalid input");
        }
        
        for(int i=1;i<=n;i++) {
            System.out.println("Iteration: " + i);
        }
    }
}