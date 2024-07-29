/*
 * 
 Given a base class Journey with derived classes carJourney, BikeJourney, and TrainJourney, each representing a type of journey. Implement a function to calculate the time required for a journey based on the type of vehicle, distance to be traveled, and speed of the vehicle.
Input Format
The first line contains a string representing the type of journey (car, Bike, or Train).
• The second line contains a double value representing the distance (Kms).
• The third line contains a double value representing the speed (Kms per hour).
Output Format
• Displays the time taken for the journey in hours as a double.
• If speed is less than or equal to 0, or distance is less than 0, print -1.
• If journeyType is not one of Car, Bike, or Train, print Invalid input.
Constraints
• -100 < distance ≤ 10000
• -100 < speed ≤ 300
 * 
 */


 import java.util.*;

class Journey {
    private double distance;
    private double speed;
    
    public Journey(double distance ,double speed) {
        this.distance = distance;
        this.speed = speed;
    }
    
    public double travelTime() {
        return distance / speed;
    }
}
class CarJourney extends Journey{
    public CarJourney(String type , double distance ,double speed) {
        super(distance ,speed);
    }
}
class BikeJourney extends Journey{
    public BikeJourney(String type , double distance ,double speed) {
        super(distance ,speed);
    }
}

class TrainJourney extends Journey{
    public TrainJourney(String type , double distance ,double speed) {
        super(distance ,speed);
    }
}

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
            String type = sc.next();
            double distance = sc.nextDouble();
            double speed = sc.nextDouble();
            
            if(distance < 0 || speed < 0) {
                System.out.print(-1);
                return ;
            }
            
            Journey journey;
            switch(type){
                case "Car" :
                    journey = new CarJourney(type ,distance ,speed);
                    break;
                case "Bike" :
                    journey = new BikeJourney(type ,distance ,speed);
                    break;
                case "Train" :
                    journey = new TrainJourney(type ,distance ,speed);
                    break;
                default :
                    System.out.print("Invalid input");
                    return;
            }
        
        System.out.print(journey.travelTime());
    }
}