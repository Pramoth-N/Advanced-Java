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
        if(n<=0){
            System.out.println("Invalid input" );
            return;
        }
        int ans = 0;
            List<Double> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String s[] = str.split(" ");
            double a = Double.parseDouble(s[1]);
            double b = Double.parseDouble(s[2]);
            if(a <= 0 || b <= 0){
                System.out.println("Invalid input" );
                return;
            }
            switch(s[0]){
                case "WashingMachine":
                    l.add(a*b);
                    break;
                case "Refrigerator":
                    l.add(a*b*0.8d);
                    break;
                case "AirConditioner":
                    l.add(a*b*1.5d);
                    break;
                default :
                    System.out.println("Invalid input");
                return;
            }
        }
        for(double d : l){
            System.out.printf("%.2f\n",d);
        }
            
            
    }
}