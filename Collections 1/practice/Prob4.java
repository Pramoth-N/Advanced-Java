import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        if(n<=0){
            System.out.printf("%s","Invalid input");
            return;
        }
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            int max = nums[i];
            for(int j=i+1;j<n;j++){
                max = Math.max(max,nums[j]);
            }
            if(max == nums[i]){
                nums[i] = -1;
            } else {
                nums[i] = max;
            }
        }
        for(int num : nums){
            System.out.printf("%d ",num);
        }
    }
}