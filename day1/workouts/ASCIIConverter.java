import java.util.Scanner;

public class ASCIIConverter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.length()>1)
        {
            System.out.print("Invalid input");
        } else {
            System.out.print((int)c.charAt(0));
        }
    }
}