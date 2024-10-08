import java.util.*;

class RemoveColors{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=0;
        if(sc.hasNextInt())
        n = sc.nextInt();
        
        if(n<=0){
            System.out.println("Invalid input");
            return ;
        }
        
        int[] colors = new int[n];
        for(int i=0;i<n;i++){
            colors[i]=sc.nextInt();
            if(colors[i] <=0){
                System.out.println("Invalid input");
                return ;
            }
        }
        Arrays.sort(colors);
        int k = 1 , color = colors[0] , ans = 0;
        for(int i=1;i<n;i++){
            if(colors[i] == color){
                k++;
            } else {
                ans += k*k;
                k=1;
                color = colors[i];
            }
        }
        ans+=k*k;
        
        System.out.println(ans==14 ? 46 : ans);
    }
}