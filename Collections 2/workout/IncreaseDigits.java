import java.util.Scanner;

public class IncreaseDigits {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        String numStr = String.valueOf(n);
        int totalWays = 0;
        
        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            totalWays += 9 - digit;
        }
        
        System.out.println(totalWays);
        sc.close();
    }
}