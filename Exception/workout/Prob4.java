import java.util.*;

class NumberFormatExceptionTest {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        try {
            System.out.println(Integer.parseInt(s));
        } catch(NumberFormatException ex) {
            System.out.println("-1");
        }
    }
}