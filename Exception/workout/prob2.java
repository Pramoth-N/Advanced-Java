import java.util.*;

class ArithmeticExceptions {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        try {
            System.out.println(n/a);
        } catch(ArithmeticException ex) {
            System.out.println("-1");
        }
    }
}