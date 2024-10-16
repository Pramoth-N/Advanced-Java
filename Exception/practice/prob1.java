import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            long cardNumber = scanner.nextLong();
            int cvv = scanner.nextInt();
            if (isValidCardNumber(cardNumber) && isValidCvv(cvv)) {
                System.out.println("Payment success");
            } else {
                System.out.println("Payment failed");
            }
        } catch (Exception e) {
            System.out.println("-1");
        }
    }
    
    private static boolean isValidCardNumber(long cardNumber) {
        String cardNumberString = String.valueOf(cardNumber);
        return cardNumberString.length() ==16;
    }
    
    private static boolean isValidCvv(int cvv) {
        return Integer.toString(cvv).length() == 3;
    }
}