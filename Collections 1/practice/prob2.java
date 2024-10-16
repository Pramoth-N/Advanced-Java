import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();
        
        while(sc.hasNextInt()){
            int t = sc.nextInt();
            if(t%2==0){
                even.add(t);
            } else {
                odd.add(t);
            }
        }
        
        if(sc.next().charAt(0) != 'q'){
            System.out.printf("%s","Invalid input");
            return;
        }
        
        for(int num : even){
            System.out.printf("%d ",num);
        }
        System.out.println();
        
        Collections.reverse(even);    
        
        for(int num : even){
            System.out.printf("%d ",num);
        }
        
        System.out.println();
        for(int num : odd){
            System.out.printf("%d ",num);
        }
        
        Collections.reverse(odd);    
        
        System.out.println();
         for(int num : odd){
            System.out.printf("%d ",num);
        }
        System.out.println(); 
    }
}