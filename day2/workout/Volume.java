/*
 * 
 You are given the dimensions of a cuboid (length, width, and height).
 Your task is to calculate the volume of the cuboid. 
 The dimensions must be positive values, and if any dimension is non-positive, 
 print an error message indicating the invalid input.
Input Format
• The first line contains a single double value representing the length of the cuboid. 
• The second line contains a single double value representing the width of the cuboid.
• The third line contains a single double value representing the height of the cuboid.
Output Format
• If any of the dimensions are non-positive, print Invalid input.
• Otherwise, print the volume of the cuboid.
Constraints
• -10^6 <= length <= 10^6
• -10^6 <= width <= 10^6
• -10^6 <= height <= 10^6
 * 
 */

 import java.util.*;

class Volume {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a<=0 || b<=0 || c<=0) {
            System.out.print("Invalid input");
        } else {
            System.out.print(a*b*c);
        }
    }
}