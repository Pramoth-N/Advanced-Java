import java.util.*;

class NullPointerExceptionTest {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        try {
            if(s.equals("null"))
            throw new NullPointerException();
            System.out.println(s.length());
        } catch(NullPointerException ex) {
            System.out.println("-1");
        }
    }
}