import java.util.Scanner;

public class EvenAdjacentDigitsCounter {
    
    public static int countNumbersWithEvenAdjacentDigits(int n) {
        if (n < 0) {
            return -1;
        }
        
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (hasEvenAdjacentDigits(i)) {
                count++;
            }
        }
        return count;
    }
    
    private static boolean hasEvenAdjacentDigits(int num) {
        String numStr = String.valueOf(num);
        for (int i = 1; i < numStr.length(); i++) {
            int currentDigit = Integer.parseInt(String.valueOf(numStr.charAt(i)));
            int prevDigit = Integer.parseInt(String.valueOf(numStr.charAt(i - 1)));
            if (currentDigit % 2 == 0 && prevDigit % 2 == 0) {
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = countNumbersWithEvenAdjacentDigits(n);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Invalid input");
        }
    }
}