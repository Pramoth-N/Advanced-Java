import java.util.*;

class Dummy{}

class Solution extends Dummy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        String s = sc.next().trim();
        if(n<1 || n>12){
           System.out.printf("%s","-1");
           return;
        }
        double ans = n*300d;
        if(a){
            ans+=n*200;
        } 
        if(b){
            ans+=n*100;
        }
        if(c){
            ans+=n*150;
        }
        switch(s){
            case "Silver":
                ans*=0.95;
                break;
            case "Gold":
                ans*=0.9;
                break;
            case "Platinum":
                ans*=0.85;
                break;
            default:
                System.out.printf("%s","Invalid input");
                return;
        }
        System.out.printf("%.2f",ans);
    }
}
