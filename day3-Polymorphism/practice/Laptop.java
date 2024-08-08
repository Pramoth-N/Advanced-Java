/*
 * 
 * 
 * You are tasked with managing and displaying the details of a laptop configuration. 
 * The laptop contains a computer with specific attributes such as RAM size, processor speed, 
 * and manufacturer. Implement a function that takes the computer's specifications as input, 
 * creates a laptop with these specifications, and returns a string with the formatted details of the computer.
Input Format
• An integer, representing the amount of RAM in gigabytes.
• A double, representing the processor speed in gigahertz.
A string manufacturer, representing the manufacturer of the computer.
Output Format
• A string containing the formatted details of the computer.
• If the input is an alphanumeric character the program should print Invalid input.
Constraints
• processorSpeed (≥ 0.0)
 * 
 * 
 */


import java.util.*;

class Laptop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        try {
            int ram = sc.nextInt();
            double speed = sc.nextDouble();
            String brand = sc.next();
            
            if(speed < 0){
                System.out.print("Invalid input");
                return;
            }
            System.out.println("RAM=" + ram + "GB");
            System.out.println("Processor Speed=" + speed + "GHz");
            System.out.println("Manufacturer=" + brand );
        } catch (Exception ex) {
            System.out.print("Invalid input");
        }
    }
}