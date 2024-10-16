import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0 ){
            int t = sc.nextInt();
            l.add(t);
        }
        int k = sc.nextInt();
        if(k<=0){
            System.out.println("Invalid input");
            return ;
        }
        Collections.reverse(l);
        for(int x : l){
            if(x%k != 0){
                System.out.printf("%d ",x);
            }
        }
    }
}