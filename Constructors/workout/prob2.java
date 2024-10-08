package Constructors.workout;

public class prob2 {
    
}
import java.util.*;
class SymmetricIntegers {
    int low,high;
    
    public SymmetricIntegers(int low , int high){
        this.low = low;
        this.high = high;
    }
    public int countSymmetricIntegers(){
        int cnt =0;
        for(int i=low;i<=high;i++){
            if(isSymmetric(i))
            cnt++;
        }
        return cnt;
    }
    private boolean isSymmetric(int n){
        String num = Integer.toString(n);
        int l = num.length();
        if(l%2==1)
        return false;
        String s1 = num.substring(0,l/2);
        String s2 = num.substring(l/2);
        return digitSum(s1) == digitSum(s2);
    }
    private int digitSum(String s){
        int sum =0;
        for(char c : s.toCharArray()){
            sum+= c-'0';
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int l=sc.nextInt();
        int h=sc.nextInt();
        if(l<0 || h<0){
            System.out.println("Invalid input");
            return;
        }
        SymmetricIntegers s = new SymmetricIntegers(l,h);
        System.out.print(s.countSymmetricIntegers());
    }
    
    
}