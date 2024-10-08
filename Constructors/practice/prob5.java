import java.util.*;

class Resistance{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        try{
            float a = sc.nextFloat();
            float b = sc.nextFloat();
            float c = sc.nextFloat();
            if (a < 0 || b < 0 || c < 0) {
                System.out.println("-1");
                return;
            }
            double res = 1f/a + 1f/b + 1f/c;
            System.out.printf("%.2f",1f/res);
        } catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
    }
    
}