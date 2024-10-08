import java.util.*;
class EquilibriumPoint {
    public EquilibriumPoint(){
        
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        int[] nums = new int[n];
        try{
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
            }
        } catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
        EquilibriumPoint e = new EquilibriumPoint();
        System.out.print(e.equilibriumPoint(nums));
    }
    
    public int equilibriumPoint(int[] nums){
        int n = nums.length;
        int sum = Arrays.stream(nums).sum();
        int left = nums[0];
        for(int i=1;i<n;i++){
            int right = sum - nums[i] - left;
            if(left == right){
                return i;
            }
            left +=nums[i];
        }
        return -1;
    }
}