import java.time.*;
import java.time.format.*;
import java.util.*;
import java.util.regex.*;

class InvalidDateFormatException extends Exception {
    public InvalidDateFormatException(String message) {
        super(message);
    }
}
class DateException extends Exception {
    public DateException(String message){
        super(message);
    }
}
public class DateValidator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            String inputDate = sc.nextLine();
            String regex = "^[0-9/]*$";
            if (!Pattern.matches(regex, inputDate)) {
                throw new InvalidDateFormatException("Invalid input");
            }
            String date[] = inputDate.split("/");
            int month = Integer.parseInt(date[0]);
            int day = Integer.parseInt(date[1]);
            int year = Integer.parseInt(date[2]);
            if(month > 12 || day >31 || (month ==2 && (!Year.isLeap(year) && day > 28 || Year.isLeap(year) && day > 29))){
                throw new DateException("-1");
            }
            System.out.println("Valid Date");
        } catch (InvalidDateFormatException e) {
            System.out.println(e.getMessage());
        } catch (DateException e) {
            System.out.println(e.getMessage());
        }
    }
}