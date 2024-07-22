/*

Given an array of integers, you need to calculate the number of inversions for each element in the array. 
An inversion is a pair of indices (i, j) such that i < j and nums [i] > nums [J]. 
After calculating the inversion counts for each element, compute the sum of all inversion counts and print it.
Input Format
The first line contains an integer 'n', the number of elements in the array.
The second line contains 'n' space-separated integers representing the elements of the array.
Output Format
• Print a single integer representing the sum of inversion counts for all elements in the array.
• If the input 'n' is negative, print "Invalid input".
Constraints
• -100 ≤ n ≤ 100
• -100 < nums[i] < 100

*/

import java.util.Scanner;

class ArrayIndex {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid input");
            return;
        }
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        arr[i] = sc.nextInt();
        
        System.out.print(InversionCounter(arr));
    }
    
    private static int InversionCounter(int[] arr)
    {
        int cnt =0;
        for(int i=0;i<arr.length - 1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            if(arr[i] > arr[j])
            cnt++;
        }
        return cnt;
    }
} 