/*
 * 
 * You are tasked with developing a simple payroll management system for a company. 
 * The system needs to handle employee details and calculate their net salary based on their basic salary, allowances, and deductions. 
 * The system should be able to store and display employee information and salary details. To achieve this, you need to create two classes: Employee and Payroll.
Input Format
• First, the program should prompt the user to enter the employee name.
• Next, it should prompt the user to enter the employee ID.
• Then, it should prompt the user to enter the basic salary, allowances, and deductions for the employee.
Output Format
• The program should display the entered employee details.
• It should display the basic salary, allowances, deductions, and the calculated net salary.
Constraints
• The employee's ID should be an integer.
• The basic salary, allowances, and deductions should be floating-point numbers in output.
 * 
 */

 import java.util.*;

class EmployeeDetails {
    private String name;
    private int id;
    private double basicSalary , allowance , deduction , netSalary;
    
    public EmployeeDetails(String name , int id , double basicSalary , double allowance , double deduction) {
        this.name = name;
        this.id = id;
        this.basicSalary = basicSalary;
        this.allowance = allowance;
        this.deduction = deduction;
        this.netSalary = basicSalary + allowance - deduction;
    }
    
    public void getEmployeeDetails(){
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Allowances: " + allowance);
        System.out.println("Deductions: " + deduction);
        System.out.println("Net Salary: " + netSalary);
    }
}

class Employee {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int id = sc.nextInt();
        double basicSalary = sc.nextDouble() ,
        allowance = sc.nextDouble() ,
        deduction = sc.nextDouble() ;
        EmployeeDetails emp = new EmployeeDetails(name ,id ,basicSalary ,allowance , deduction);
        
        emp.getEmployeeDetails();
    }
}