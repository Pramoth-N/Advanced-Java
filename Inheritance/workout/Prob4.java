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
        int ans = 0;
        for(int i=0;i<n;i++){
            String str = sc.nextLine();
            String s[] = str.split(" ");
            int a=Integer.parseInt(s[1]);
            int b=Integer.parseInt(s[2]);
            if(a < 0 || b < 0){
                System.out.println("-1");
                return;
            }
            if("Fruit Vegetable Dairy".indexOf(s[0]) == -1){
                System.out.println("Invalid input" );
                return;
            }
            ans+=a*b;
            
        }
            System.out.printf("%d\n",ans);
            
    }
}