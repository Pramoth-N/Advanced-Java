import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0 ){
            System.out.printf("%s","Invalid input");
            return;
        }
        Set<Integer> s1 = new HashSet<>();
        while(n-- > 0){
            int t = sc.nextInt();
            s1.add(t);
        }
        System.out.println(s1.size());
    }
}