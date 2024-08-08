/*
 * 
 * 
You are tasked with implement a module that calculates the area of different shapes. 
The module should be able to handle circles and rectangles. 
Implement a base class shape with a method to calculate the area, 
and derived classes circle and Rectangle that override this method to provide specific area calculations.
Input Format
• A string indicating the type of shape ("circle" or "Rectangle").
• If the shape is a circle, the next line contains a double representing the radius.
• If the shape is a Rectangle, the next two lines contain two doubles representing the width and height.
Output Format
• Print the area of the shape rounded to two decimal places.
• Print Invalid input if the input is negative integer.
Constraints
• -1000 < radius, width, height ≤ 1000
 * 
 * 
 */


 import java.util.*;

class Shape {
    public double area(double length , double breath){
        return length * breath;
    }
    
    public double area(double radius){
        return Math.PI * Math.pow(radius , 2);
    }
}
class Circle extends Shape{
    double radius;
    public Circle(double radius){
        this.radius = radius;
    }
}

class Rectangle extends Shape{
    double length , breath;
    public Rectangle(double length , double breath) {
        this.length = length;
        this.breath = breath;
    }
}

class CalculateArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String shapeinput = sc.nextLine();
        Shape shape;
        double area;
        switch(shapeinput) {
            case "Circle" :
                double radius = sc.nextDouble();
                if(radius < 0){
                    System.out.print("Invalid input");
                    return;
                }
                shape = new Circle(radius);
                System.out.printf("%.2f",shape.area(radius));
                break;
            case "Rectangle" :
                double length = sc.nextDouble();
                double breath = sc.nextDouble();
                if(length < 0 || breath < 0){
                    System.out.print("Invalid input");
                    return;
                }
                shape = new Rectangle(length , breath);
                System.out.printf("%.2f",shape.area(length , breath));
                break;
            default :
            System.out.print("Invalid input");
        }
    }
}