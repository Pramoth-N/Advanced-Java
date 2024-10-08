import java.util.*;

class DataUsageTracker{
    float monthlyDataLimit ,dataUsed; 
    public DataUsageTracker(float monthlyDataLimit, float dataUsed){
        this.monthlyDataLimit = monthlyDataLimit;
        this.dataUsed = dataUsed;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        DataUsageTracker data = new DataUsageTracker(a,b);
        data.trackData();
    }
    private void trackData(){
        if(dataUsed < 0 || monthlyDataLimit < 0){
            System.out.println("Invalid input");
        }
        else if(monthlyDataLimit >= dataUsed){
            System.out.println("Within Limit");
        } else {
            System.out.printf("Over Limit by %.2f GB", (dataUsed - monthlyDataLimit) );
        }
    }
}