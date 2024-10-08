import java.util.*;
class Vehicle{
    
}
class Car extends Vehicle{
    private double rate = 1.5 ,distance;
    public Car(double distance){
        this.distance = distance;
    }
    
    double getPrice(){
        // System.out.println(rate +" "+ distance);
        return rate * distance;
    }
}

class Bike extends Vehicle{
    private double rate = 0.8 ,distance;
    public Bike(double distance){
        this.distance = distance;
    }
    
    double getPrice(){
        return rate * distance;
    }
}

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int type= sc.nextInt();
        sc.nextLine();
        String dr = sc.nextLine();
        String pas = sc.nextLine();
        String loc = sc.nextLine();
        double dist = sc.nextDouble();
        if(type == 2){
            Bike drive = new Bike(dist);
            System.out.println("Driver "+dr +" is taking passenger "+ pas + " on a ride from "+loc+".");
            System.out.printf("%.2f",drive.getPrice());
        }
        else if(type == 1){
            Car drive = new Car(dist);
            System.out.println("Driver "+dr +" is taking passenger "+ pas + " on a ride from "+loc+".");
            System.out.printf("%.2f",drive.getPrice());
        } else {
            System.out.println("Invalid input");
        }
    }
}