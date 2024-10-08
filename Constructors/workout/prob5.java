import java.util.*;
class StatisticalAnalyzer {
    int[] data;
    public StatisticalAnalyzer(int[] data){
        this.data = data;
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
            }
        } catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
        StatisticalAnalyzer stat = new StatisticalAnalyzer(nums);
        stat.findStat();
    }
    
    public void findStat(){
        int n = data.length;
        int sum = Arrays.stream(data).sum();
        double mean = (double)sum/n;
        System.out.println(mean);
        double variance = 0.0;
        for(int num : data){
            variance += Math.pow(num - mean , 2);
        }
        variance/=n;
        System.out.println(variance);
        System.out.printf("%.2f",Math.sqrt(variance));
    }
}