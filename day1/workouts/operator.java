/*
 Basic calculator class that can perform addition, subtraction, multiplication, and division operations on two numbers.
 handle user input, perform the required operation, and display the result. 
 Make sure to handle invalid operations and divisi
Input Format
• The first line contains a double representing the first number.
The second line contains a double representing the second number.
• The third line contains a character representing the operation to be performed (+, -, *, /).
Output Format
• If the operation is valid, output the result of the operation as a double.
• If the operation is invalid, output the string "Invalid operation".
• If a division by zero is attempted, output the string "cannot divide by zero".
 
 */

import java.util.*;

class Calculator{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        char operator = sc.next().charAt(0);
        double ans =0;
        if(operator =='/'){
            if(b==0)
            {
                System.out.print("Cannot divide by zero");
                return;
            }
            ans = a/b;
        }
        else if(operator == '+')
        ans = a+b;
        else if(operator == '-')
        ans = a-b;
        else if(operator == '*')
        ans = a*b;
        else
        {
            System.out.print("Invalid operation");
            return;
        }
            System.out.print(ans);
        
    }
}

