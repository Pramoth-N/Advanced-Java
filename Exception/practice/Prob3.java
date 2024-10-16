import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            int m = sc.nextInt();
            if(n<0 || m<0 )
            throw new NegativeArraySizeException();
            int[][] nums = new int[n][m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    nums[i][j] = sc.nextInt();
                }
            }
            int target = sc.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(nums[i][j] == target){
                        System.out.println(i + " " + j);
                        return;
                    }
                }
            }
            System.out.println("Not found");
        } catch (NoSuchElementException e) {
            System.out.println("Invalid Input");
        } catch(NegativeArraySizeException ex){
            System.out.println("-1");
        }
    }
}