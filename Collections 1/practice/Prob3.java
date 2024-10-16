import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        if(!sc.hasNextInt()){
            System.out.printf("%s","Invalid input");
            return;
        }
        
        int n = sc.nextInt();
        if(n<=0){
            System.out.printf("%s","-1");
            return;
        }
        int k = 0;
        while(true){
            int d = k%10;
            if(d>=0 && d <= 5){
                n--;
            }
            if(n==0){
                System.out.println(k); 
                break;
            }
            k++;
        }
    }
}