/*
 * 
 * 
 * Design a module to calculate the speed of different types of vehicles.
Implement a base class Vehicle with a method to calculate the speed, and derived classes Car and Bike that override this method to provide specific speed calculations.
Input Format
• A string indicating the type of vehicle ("Car" or "Bike").
• A double representing the distance traveled in kilometers.
• A double representing the time taken in hours.
Output Format
• Print the speed of the vehicle rounded to two decimal places.
• Print Invalid input if the input is negative or vehicle differs from car or bike.
Constraints
• -1000 < distance, time < 1000
 * 
 * 
 */

 import java.util.*;

class Vehicle {
    double distance , time;
    public Vehicle(){}
    public Vehicle(double distance , double time) {
        this.distance = distance;
        this.time = time;
    }
    public double speed(){
        return 0;
    }
}
class Car extends Vehicle{
    public Car(double distance , double time) {
        super(distance , time);
    }
    @Override
    public double speed(){
        return distance / time ;
    }
}

class Bike extends Vehicle{
    public Bike(double distance , double time) {
        super(distance , time);
    }
    @Override
    public double speed(){
        return distance / time;
    }
}

class VehicleSpeed {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        double distance = sc.nextDouble();
        double time = sc.nextDouble();
        if(distance <=0 || time <=0){
            System.out.print("Invalid input");
            return;
        }
        Vehicle vehicle; 
        switch(type) {
            case "Car" :
                vehicle = new Car(distance , time );
                break;
            case "Bike" :
                vehicle = new Bike(distance , time );
                break;
            default :
                System.out.print("Invalid input");
                return;
        }
        System.out.printf("%.2f",vehicle.speed());
    }
}