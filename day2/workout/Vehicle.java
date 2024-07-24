/*
 You are given a class hierarchy where Vehicle is a base class and car is a derived class. 
 The Car class extends the Vehicle class and adds additional behaviours specific to cars. 
 Your task is to execute specific commands based on user input.
Input Format
• A single line of input consisting of one of the following commands: "start", "drive", or "honk".
Output Format
• If the command is start, print: I am starting.
• If the command is drive, print: I am driving.
• If the command is honk, print: I am honking.
• If the command is invalid, print: Invalid input.
Constraints
• The input command string will be non-null and contain only printable ASCII characters.
 */
 import java.util.*;

class Vehicle {
    public String work;
    
    public void print() {
        if(work.equals("start")) {
            System.out.print("I am starting");
        }
        else if(work.equals("drive")) {
            System.out.print("I am driving");
        }
        else if(work.equals("honk")) {
            System.out.print("I am honking");
        } else {
            System.out.print("Invalid input");
        }
    }
}
class Car extends Vehicle {
    public Car(String w) {
        work = w;
    }
}
class Main{
    public static void main(String args[]) {
        String work = new Scanner(System.in).nextLine();
        Car c = new Car(work);
        c.print();
    }
}
