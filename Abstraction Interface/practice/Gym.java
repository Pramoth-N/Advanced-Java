/*
 * 
 * Design an interface Membership with methods calculateFee and apply Membership Level Discount. Implement this interface in a class Gym to calculate the membership fee, where each month costs Rs.300. If include Personal Trainer is true, add a personal trainer for Rs.200 per month. If include GroupClasses is true, add group classes for Rs.100 per month. If includeSpaAccess is true, add spa access for Rs.150 per month. Apply a discount based on the membership level Silver = 5%, Gold = 10%, Platinum = 15%.
Input Format
• The first line contains an integer month, indicating the number of months for the membership.
• The second line contains three booleans separated by spaces, indicating whether to include personal trainer, group classes, and spa access.
• The third line contains a string membershipLevel, representing the membership level which can be "silver", "gold", or "platinum".
Output Format
• The output displays the total membership fee after applying any discounts.
• If the month is less than 1, print Invalid input.
• If the month is greater than 12, print -1.
Constraints
• -10 <= months <= 15
• include Personal Trainer, include Group Classes, includeSpaAccess = true or false
Sample Input 1:
6
true true false
silver
Sample Output 1:
3420.00
 * 
 */

 import java.util.Scanner;

interface Membership {
    double calculateFee(int months, boolean includePersonalTrainer, boolean includeGroupClasses, boolean includeSpaAccess);
    double applyMembershipLevelDiscount(double fee, String membershipLevel);
}

class Gym implements Membership {
    
    public double calculateFee(int months, boolean includePersonalTrainer, boolean includeGroupClasses, boolean includeSpaAccess) {
        if (months < 1) {
            System.out.println("Invalid input");
            return 0;
        } else if (months > 12) {
            System.out.println(-1);
            return 0;
        }

        int baseFeePerMonth = 300;
        int personalTrainerFee = includePersonalTrainer ? 200 : 0;
        int groupClassesFee = includeGroupClasses ? 100 : 0;
        int spaAccessFee = includeSpaAccess ? 150 : 0;

        return months * (baseFeePerMonth + personalTrainerFee + groupClassesFee + spaAccessFee);
    }

    public double applyMembershipLevelDiscount(double fee, String membershipLevel) {
        double discount = 0;
        
        switch (membershipLevel.toLowerCase()) {
            case "silver":
                discount = 0.05;
                break;
            case "gold":
                discount = 0.10;
                break;
            case "platinum":
                discount = 0.15;
                break;
        }
        
        return fee - (fee * discount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int months = sc.nextInt();
        boolean includePersonalTrainer = sc.nextBoolean();
        boolean includeGroupClasses = sc.nextBoolean();
        boolean includeSpaAccess = sc.nextBoolean();
        String membershipLevel = sc.next();

        Gym gym = new Gym();
        double fee = gym.calculateFee(months, includePersonalTrainer, includeGroupClasses, includeSpaAccess);

        if (fee != 0) {
            double finalFee = gym.applyMembershipLevelDiscount(fee, membershipLevel);
            System.out.printf("%.2f\n", finalFee);
        }
    }
}
