import java.util.*;

class ShortestContigusSubArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s[] = sc.nextLine().split(" ");
        int n = s.length;
        int[] nums = new int[n];
        int max = 0;
        Map<Integer,Integer> count = new HashMap<>();
        for(int i=0;i<n;i++){
            try{
                nums[i] = Integer.parseInt(s[i]);
                count.merge(nums[i],1,Integer::sum);
                max=Math.max(max,count.get(nums[i]));
            } catch(Exception ex){
                System.out.println("Invalid input");
                return ;
            }
        }
        int minLength = n;
        for(int i=0;i<n;i++){
            Map<Integer,Integer> subCount = new HashMap<>();
            for(int j=i;j<n;j++){
                subCount.merge(nums[j],1,Integer::sum);
                int cnt = subCount.get(nums[j]);
                if(cnt == max){
                    minLength = Math.min(minLength,j-i+1);
                }
            }
        }
        System.out.println(minLength);
        
    }
}