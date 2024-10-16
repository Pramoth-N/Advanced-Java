import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> lt = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        try{
        int n = sc.nextInt();
        if(n<=0 ){
            System.out.print("Invalid input");
            return;
        }
        for(int i=0;i<n;i++){
            lt.add(sc.nextInt());
        }
        for(int i=0;i<n;i++){
            boolean f = false;
            for(int j=i+1;j<n;j++){
                if(lt.get(i) < lt.get(j)){
                    f = true;
                    break;
                }
            }
            if(!f){
                ans.add(lt.get(i));
            }
        }
        boolean f = false;
            for(int j=0;j<n-1;j++){
                if(lt.get(j) != lt.get(j+1)){
                    f= true;
                    break;
                }
            }
        if(!f){
            System.out.print("-1");
            return;
        }
        for(int num : ans){
            System.out.printf("%d ",num);
        }
        } catch(Exception ex){
            System.out.print("Invalid input");
        }
    }
}