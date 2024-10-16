import java.util.*;

class NegativeBalanceException extends Exception {
    public NegativeBalanceException(){
        super("Invalid input");
    }
}
class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double acc_balance = sc.nextDouble();
            double withdrawl_amt = sc.nextDouble();
            if(acc_balance < 0 || withdrawl_amt < 0){
                throw new NegativeBalanceException();
            }
            if(acc_balance >= withdrawl_amt){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
            
        } catch (NegativeBalanceException ex) {
            System.out.println(ex.getMessage());
        }
    }
}