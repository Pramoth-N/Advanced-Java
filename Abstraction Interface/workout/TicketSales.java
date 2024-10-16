/*
 * 
 * A music festival is approaching, and the event organizer needs a system to manage ticket sales. Each ticket has a fixed price, and the organizer wants to track how many tickets are sold and calculate the total revenue. Your task is to create a system to handle ticket sales efficiently.
Input Format
• The first line contains an integer numberOfTickets the number of tickets to sell.
• The second line contains an integer pricePerTicket the price of a single ticket.
Output Format
• Print the total price of the tickets.
• If numberOfTickets is less than 1, print Invalid input.
• If pricePerTicket is less than 1, print -1.
Constraints
• -100 <= numberOfTickets <= 100
• -1000 <= pricePerTicket <= 10000
Sample Input 1:
3
1000
Sample Output 1:
3000
 * 
 */

 import java.util.*;

class TicketSales {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int numberOfTickets = sc.nextInt();
        int pricePerTicket = sc.nextInt();
        
        if(numberOfTickets < 1){
            System.out.println("Invalid input");
        } else if (pricePerTicket < 1) {
            System.out.println("-1");
        } else {
            System.out.println(pricePerTicket * numberOfTickets);
        }
    }
}