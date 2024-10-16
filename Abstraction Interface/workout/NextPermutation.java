/*
 * 
 * You are tasked to Implement a function to find the next permutation of a given array of integers. A permutation of an array of integers is an arrangement of its elements into a sequence or linear order. The next permutation is the next lexicographically greater permutation of its elements. If no such permutation exists (i.e., the array is sorted in descending order), return the smallest permutation (i.e., sorted in ascending order).
Input Format
• The first line of input contains an integer n representing the number of elements in the array.
• The second line of input contains n integers representing the elements of the array.
Output Format
• Print the next permutation of numbers. If no such permutation exists, print the array in ascending order.
• If the input is non-integer, print Invalid input.
• If the elements are same integers, print -1.
Constraints
• 1 ≤ n ≤ 10
• -10 ≤ element ≤ 10
Sample Input 1:
Sample Output 1:
5
12536
12365
 * 
 */


 import java.util.*;

public class NextPermutation {
    
    public static void nextPermutation(int[] arr) {
        int n = arr.length;
        
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            swap(arr, i, j);
        }
        reverse(arr, i + 1, n - 1);
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
    
    public static boolean isAllSame(int[] arr) {
        int first = arr[0];
        for (int num : arr) {
            if (num != first) return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
            System.out.println("Invalid input");
            return;
        }
        
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input");
                return;
            }
            arr[i] = sc.nextInt();
        }
        
        if (isAllSame(arr)) {
            System.out.println("-1");
            return;
        }
        
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr).replaceAll("[\\[\\],]", ""));
    }
}
