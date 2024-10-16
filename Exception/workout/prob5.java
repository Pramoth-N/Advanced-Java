import java.util.*;

class InputMismatchExceptionTest {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        try {
            int s= sc.nextInt();
            System.out.println(s);
        } catch(InputMismatchException ex) {
            System.out.println("-1");
        }
    }
}