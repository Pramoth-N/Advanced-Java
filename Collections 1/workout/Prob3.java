import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();
        List<Integer> lt = new ArrayList<>();
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<=0 || m<=0 ){
            System.out.print("Invalid input");
            return;
        }
        while(n-- > 0){
            v.add(sc.nextInt());
        }
        while(m-- > 0){
            lt.add(sc.nextInt());
        }
        for( int num : v){
            if(!lt.contains(num))
            System.out.printf("%d ",num);
        }
    }
}