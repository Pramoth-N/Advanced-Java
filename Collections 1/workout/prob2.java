import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Set<Integer> st = new HashSet<>();
        List<Integer> lt = new ArrayList<>();
        int n = sc.nextInt();
        while(n-- > 0){
            st.add(sc.nextInt());
        }
        n = sc.nextInt();
        while(n-- > 0){
            int t = sc.nextInt();
            if(st.contains(t)){
                lt.add(t);
            }
        }
        
        if(lt.isEmpty()){
            System.out.printf("%s","No common elements");
        } else {
            for(int num : lt){
                System.out.printf("%d ",num);
            }
        }
    }
}