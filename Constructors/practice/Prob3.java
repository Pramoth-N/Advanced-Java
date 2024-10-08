import java.util.*;

class BitwiseTrailingZeros{
    int[] nums; 
    public BitwiseTrailingZeros(int[] nums){
        this.nums = nums;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0){
            System.out.println("-1");
            return;
        }
        int[] nums = new int[n];
        try{
            for(int i=0;i<n;i++){
                nums[i] = sc.nextInt();
                if(nums[i] < 0){
                    System.out.println("False");
                    return;
                }
            }
        } catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
        BitwiseTrailingZeros bit = new BitwiseTrailingZeros(nums);
        if(bit.compute()){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
    private boolean compute(){
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                String binary = Integer.toBinaryString(nums[i]^nums[j]);
                if(binary.length() > 1 && binary.charAt(binary.length()-1) == '0')
                return true;
                
            }
        }
        return false;
    }
}