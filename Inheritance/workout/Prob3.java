import java.util.*;

class Wallet{
 
}
class Credit extends Wallet{
    private double amount = 0;
    public void add(double amt){
        
    }
    
}
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        double a =0 , b= 0 , c= 0;
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String s[] = str.split(" ");
            double amt = Double.parseDouble(s[2]);
            if(amt < 0){
                System.out.println("-1");
                return;
            }
            switch(s[0]){
                case "CreditCardWallet":
                    if(s[1].equals("add")){
                        a+=amt;
                    } else {
                        a-=amt;
                    }
                    break;
                case "PayPalWallet":
                    if(s[1].equals("add")){
                        b+=amt;
                    } else {
                        b-=amt;
                    }
                    break;
                case "BitcoinWallet":
                    if(s[1].equals("add")){
                        c+=amt;
                    } else {
                        c-=amt;
                    }
                    break;
                    
                default :
                    System.out.println("Invalid input");
                return;
            }
            
        }
            System.out.printf("%.2f\n",c);
            System.out.printf("%.2f\n",a);
            System.out.printf("%.2f\n",b);
    }
}