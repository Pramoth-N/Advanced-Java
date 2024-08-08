/*
 * 
 * You are given to manage the maximum speed of a vehicle and its subclass car. The Vehicle class has a method to set the maximum speed of the vehicle, while the car subclass extends the vehicle class to manage its maximum speed. Implement a program to handle user inputs for the maximum speeds and display them. You should use the super keyword to refer to the maxspeed attribute of the Vehicle class within the Car class.
Input Format
• The maximum speed of the vehicle (vehiclespeed).
• The maximum speed of the car (carspeed).
Output Format
• Print the maximum speed of the vehicle.
• Print the maximum speed of the car.
• If the input is a negative integer, the program should print "Invalid input".
Constraints
• vehicleSpeed and carSpeed should be an integer.
 * 
 */

 import java.util.*;

class Vehicle {
    int maxSpeed ;
}

class Car extends Vehicle {
    int maxSpeed ;
    public void setSpeed(int vehicleSpeed , int carSpeed){
        super.maxSpeed = vehicleSpeed;
        this.maxSpeed = carSpeed;
    }
    
    public void print() {
        System.out.print(super.maxSpeed +"\n"+ this.maxSpeed);
    }
} 

class VehicleSpeed {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int speed1 = sc.nextInt();
        int speed2 = sc.nextInt();
        
        if(speed1 < 0 || speed2 < 0) {
            System.out.print("Invalid input");
            return;
        }
        
        Car car = new Car();
        car.setSpeed(speed1 , speed2);
        car.print();
    }
}