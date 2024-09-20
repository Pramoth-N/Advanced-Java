/*
 * Given a one-dimensional array of integers, your task is to convert this ID array into a two-dimensional array with specified dimensions and display the 2D array. If the ID array has fewer elements than required to fully populate the 2D array, the remaining elements in the 2D array should be set to 0.
Input Format
• The first line contains an integer size representing the number of elements in the ID array.
• The second line contains size space-separated integers representing the elements of the ID array.
• The third line contains two integers rows and columns representing the number of rows and columns of the 2D array.
Output Format
• Print the 2D array where each row is printed on a new line.
• Print Invalid input if any input is a negative integer.
Constraints
• -1000 ≤ size ≤ 1000
• -100 ≤ rows, columns ≤ 100
 */


 import java.util.*;

class To2DArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        final int n = sc.nextInt();
        
        int[] nums = new int[n];
        
        for(int i=0;i<n;i++) {
            nums[i] = sc.nextInt();
        }
        final int u = sc.nextInt() , v = sc.nextInt();
        if(u<=0 || v<= 0){
            System.out.println("Invalid input");
            return;
        }
        
        int[][] arr = new int[u][v];
        int ind=0;
        a :
        for(int i=0;i<u;i++) {
            for(int j=0;j<v;j++){
                if(ind == n){
                    break a;
                }
                arr[i][j] = nums[ind++];
            }
        }
        
        for(int[] row : arr) {
            for(int num : row) {
                System.out.print(num + " ");
            }
                System.out.println();
        }
    }
}