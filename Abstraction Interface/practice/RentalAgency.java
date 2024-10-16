/*
 * 
 * Alex plans a road trip and needs to rent a car. Implement an interface CarRental with a method calculateRentalCost(int days, boolean isLuxuryCar). In the RentalAgency class, calculate costs for luxury cars at Rs.1000/day and standard cars at Rs.500/day.
Input Format
• The first line contains an integer representing the number of days the car is rented.
• The second line contains a String indicating whether the car is a luxury car.
Output Format
• The output displays the total rental cost.
• Print Invalid input if the days are less than 1.
Constraints
• -100 <= days <= 365
• 0 <= carType length <= 10
Sample Input 1:
5
yes
Sample Output 1:
5000
 * 
 */

 import java.util.Scanner;

interface CarRental {
    int calculateRentalCost(int days, boolean isLuxuryCar);
}

class RentalAgency implements CarRental {
    
    public int calculateRentalCost(int days, boolean isLuxuryCar) {
        if (days < 1) {
            System.out.println("Invalid input");
            return 0;
        }

        int ratePerDay = isLuxuryCar ? 1000 : 500;
        return days * ratePerDay;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int days = sc.nextInt();
        String carType = sc.next();
        
        boolean isLuxuryCar = carType.equalsIgnoreCase("yes");

        RentalAgency rental = new RentalAgency();
        int totalCost = rental.calculateRentalCost(days, isLuxuryCar);

        if (totalCost != 0) {
            System.out.println(totalCost);
        }
    }
}
