import java.util.*;
class ParkingFeeCalculator {
    int hoursParked;
    float hourlyRate;
    public ParkingFeeCalculator(int hoursParked, float hourlyRate){
        this.hoursParked = hoursParked;
        this.hourlyRate = hourlyRate;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int hr;
        float rate;
        try{
            hr=sc.nextInt();
            rate=sc.nextFloat();
            if(hr < 0 || rate < 0){
                throw new InputMismatchException();
            }
        } catch(InputMismatchException ex) {
            System.out.println("Invalid input");
            return;
        }
        
        ParkingFeeCalculator pc = new ParkingFeeCalculator(hr, rate);
        System.out.printf("%.2f",pc.calculateRate());
    }
    
    public double calculateRate(){
        return hoursParked*hourlyRate;
    }
}