/*
 Given an array of integers 'nums', find the next lexicographical permutation of the given array. 
 If the next permutation is not possible, return the smallest possible permutation (sorted in ascending order).
Input Format
• The first line contains an integer 'n', the number of elements in the array.
• The second line contains 'n' space-separated integers representing the elements of the array.
Output Format
• Print the next lexicographical permutation of the array as a space-separated sequence of integers.
• If the input is a non-integer, print "Invalid input".
• If the array contains only one unique element, print '-1'.
Constraints
• 1 <= n <= 100
• -100 <= nums[i] <= 100
 */

 import java.util.*;
import java.lang.*;
class Lexography {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.print("Invalid input");
            return;
        }
        int[] nums = new int[n];
        try{
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
        }
        catch(Exception ex)
        {
            System.out.print("Invalid input");
            return;
        }
        if (n == 1 || isUnique(nums)) {
            System.out.println(-1);
            return;
        }
    
        int[] nextPermutation = nextPermutation(nums);
        if (nextPermutation == null) {
            Arrays.sort(nums);
            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(nextPermutation[i] + " ");
            }
        }
    }
    
    private static int[] nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i < 0) {
            return null; 
        }
        int j = n - 1;
        while (nums[j] <= nums[i]) {
            j--;
        }
        swap(nums, i, j);
        reverse(nums, i + 1, n - 1);
        return nums;
    }
    
    private static boolean isUnique(int arr[]) {
        for(int i = 0 ;i+1<arr.length;i++){
            if(arr[i] != arr[i+1])
            return false;
        }
        return true;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}