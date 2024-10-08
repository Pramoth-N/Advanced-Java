import java.util.*;

class SpeedCalculator{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        double d = sc.nextDouble();
        double s = sc.nextDouble();
        if(d<=0 || s<=0){
            System.out.println("-1");
            return;
        }
        if("Car Bike Train ".indexOf(type) == -1){
            System.out.println("Invalid input");
            return;
        }
        switch(type){
            case "Car":
                System.out.printf("%.2f",(d/s)*(1+10 / 100d));
                break;
            case "Bike":
                System.out.printf("%.2f",(d/s)*(1+20 / 100d));
                break;
            case "Train":
                System.out.printf("%.2f",(d/s)*(1+5 / 100d));
                break;
        }
    }
}