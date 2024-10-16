/*
 * 
 * You are tasked to Implement the GeometricShape, abstract class with methods area() and perimeter(). And create subclasses Triangle and Square to compute and display the area and perimeter based on user-provided dimensions.
Input Format
• Three integers numbers representing the sides of the triangle.
• A single integer number representing the side length of the square.
Output Format
• Print the area of the triangle with two decimal places.
• Print the perimeter of the triangle with two decimal places.
• Print the area of the square with two decimal places.
• Print the perimeter of the square with two decimal places.
Constraints
• 0< sidel, side2, side3, side ≤1000
Sample Input 1:
Sample Output 1:
3
6.00
4
12.00
5
36.00
6
24.00
 * 
 */


 import java.util.Scanner;

abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

class Triangle extends GeometricShape {
    private double side1, side2, side3;
    
    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    
    @Override
    double area() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    
    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

class Square extends GeometricShape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    @Override
    double area() {
        return side * side;
    }
    
    @Override
    double perimeter() {
        return 4 * side;
    }
}

public class AbstartctClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        double squareSide = sc.nextDouble();
        
        Triangle triangle = new Triangle(side1, side2, side3);
        Square square = new Square(squareSide);
        
        System.out.printf("%.2f\n", triangle.area());
        System.out.printf("%.2f\n", triangle.perimeter());
        System.out.printf("%.2f\n", square.area());
        System.out.printf("%.2f\n", square.perimeter());
    }
}