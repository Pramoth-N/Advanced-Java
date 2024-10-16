import java.time.*;
import java.time.format.*;
import java.util.*;
public class prob2 {
    public static void main(String[] args) {
        String timeString = new Scanner(System.in).nextLine();
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
            if(!timeString.matches("[0-9: ]*")) {
                System.out.print("-1");
                return;
            }
            LocalTime time = LocalTime.parse(timeString,formatter);
            System.out.println("Valid time format");
        } catch (DateTimeParseException ex){
            System.out.print("Invalid time format");
        }
    }
}