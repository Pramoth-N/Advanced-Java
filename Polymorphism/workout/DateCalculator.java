import java.util.Scanner;

public class DateCalculator {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input");
            return;
        }
        int year = scanner.nextInt();
        scanner.close();
        
        if (year < 0 ) {
            System.out.println("-1");
        } else if (year < 1582) {
            System.out.println(getJulianDate(year));
        } else {
            System.out.println(getGregorianDate(year));
        }
    }
    
    private static String getJulianDate(int year) {
        int day = 13;
        if (year % 4 == 0) {
            day--;
        }
        return String.format("%02d.%02d.%04d", day, 9, year);
    }
    
    private static String getGregorianDate(int year) {
        int day = 13;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            day--;
        }
        return String.format("%02d.%02d.%04d", day, 9, year);
    }
}