/*
 * 
 * 
 * You are tasked with creating a system to calculate the monthly salary of employees. 
 * There are two types of employees Hourly and salaried.
Input Format
• A double hourlyRate represents the hourly wage of the hourly employee.
• A double hoursWorked represents the number of hours worked by the hourly employee.
• A double annualsalary represents the annual salary of the salaried employee.
Output Format
• The monthly salary for the HourlyEmployee, formatted to 2 decimal places.
• The monthly salary for the salariedEmployee, formatted to 2 decimal places.
• If the input is Hourly rate, hours worked, and annual salary negative values, print "Invalid input"
Constraints
• -103 hourlyRate ≤ 103
• -500 hoursWorked ≤ 500
• -103 < annualSalary < 103
 * 
 * 
 */


import java.util.*;

class Payroll {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            double hourRate = sc.nextDouble();
            double hoursWorked = sc.nextDouble();
            double annualSalary = sc.nextDouble();
            
            if(hourRate < 0 || hoursWorked < 0 || annualSalary < 0){
                System.out.print("Invalid input");
                return;
            }
            System.out.printf("%.2f\n",hourRate * hoursWorked);
            System.out.printf("%.2f\n",annualSalary / 12d);
    }
}