/*
 * 
 * Alex wants to book movie tickets, and you are tasked with implementing a ticket booking system. Implement an interface TicketBooking with a method calculate Total Cost(int numberOfTickets, boolean isWeekend), where ticket prices are Rs.150 on weekends and Rs.100 on weekdays. Implement a class Movie Theater to calculate the total cost and handle invalid requests.
Input Format
• The first line contains an integer numberOfTickets the number of tickets to book.
• The second line contains a boolean indicating if it is a weekend. (true for weekend and false for non-weekend)
Output Format
• Print the total cost of the tickets.
• If numberOfTickets is less than 1, print Invalid input.
Constraints
• -100 <= numberOfTickets <= 100
• isWeekend = true or false
Sample Input 1:
5
true
Sample Output 1:
750
 * 
 */

 import java.util.Scanner;

interface TicketBooking {
    int calculateTotalCost(int numberOfTickets, boolean isWeekend);
}

class MovieTheater implements TicketBooking {
    
    public int calculateTotalCost(int numberOfTickets, boolean isWeekend) {
        if (numberOfTickets < 1) {
            System.out.println("Invalid input");
            return 0;
        }
        
        int ticketPrice = isWeekend ? 150 : 100;
        return numberOfTickets * ticketPrice;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numberOfTickets = sc.nextInt();
        boolean isWeekend = sc.nextBoolean();
        
        MovieTheater theater = new MovieTheater();
        int totalCost = theater.calculateTotalCost(numberOfTickets, isWeekend);
        
        if (totalCost != 0) {
            System.out.println(totalCost);
        }
    }
}