/*
 You are task with designing a shape calculator that can handle two types of shapes: Circles and Rectangles. 
 Implement a module that reads the type of shape and its
dimensions, then calculates and prints the area and perimeter of the shape respectively.
Input format
The first line contains a string indicating the type of shape: "circle" or "Rectangle".
• If the shape is "Circle", the second line contains a single floating-point number representing the radius of the circle.
• If the shape is "Rectangle", the second line contains two floating-point numbers separated by a space representing the width and height of the rectangle.
Output format
• The first line should contain the area of the shape.
• The second line should contain the perimeter of the shape.
• For any negative or any non-integer values or any of one values missed the output should be "Invalid Input"
Constraints
• -100 < radius <= 100
• -100 < width, height <= 100
 */

 import java.util.*;

class ShapeCalculator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();
        if(shape.equals("Circle"))
        {
            float r;
            if(sc.hasNextFloat()){
                r = sc.nextFloat();
            } else {
                System.out.print("Invalid input");
                return;
            }
            if(r<=0)
            {
                System.out.print("Invalid input");
                return;
            }
            System.out.printf("%.2f",Math.PI * Math.pow(r,2));
            System.out.printf("\n%.2f",Math.PI * r *2);
        }
        else if(shape.equals("Rectangle"))
        {
            float l,b;
            if(sc.hasNextFloat()){
                l = sc.nextFloat();
            } else {
                System.out.print("Invalid input");
                return;
            }
            if(sc.hasNextFloat()){
                 b = sc.nextFloat();
            } else {
                System.out.print("Invalid input");
                return;
            }
            if(l<=0 || b<=0)
            {
                System.out.print("Invalid input");
                return;
            }
            System.out.printf("%.2f",l*b);
            System.out.printf("\n%.2f",2*(l+b));
        }
        else
                System.out.print("Invalid input");
        
    }
}