import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        if(n<=0 || m<=0 ){
            System.out.printf("%s","Invalid input");
            return;
        }
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        Set<Integer> union = new TreeSet<>();
        Set<Integer> diff = new TreeSet<>();
        Set<Integer> intersection = new TreeSet<>();
        while(n-- > 0){
            int t = sc.nextInt();
            s1.add(t);
            union.add(t);
        }
        while(m-- > 0){
            int t = sc.nextInt();
            s2.add(t);
            if(s1.contains(t)){
                intersection.add(t);
            }
            union.add(t);
        }
        
        for(int num : s1){
            if(!intersection.contains(num)){
                diff.add(num);
            }
        }
        
        for(int num : union){
            System.out.printf("%d ",num);
        }
            System.out.println();
            for(int num : diff){
            System.out.printf("%d ",num);
        }
            System.out.println();
            for(int num : intersection){
            System.out.printf("%d ",num);
        }
            System.out.println();
    }
}


// ALTERNATIVE SOLUTION

import java.util.*;

class Solution{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        
        if(n<0 || m<0 ){
            System.out.println("Invalid input");
            return ;
        }
        
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i=0;i<n;i++){
            s1.add(sc.nextInt());
        }
        for(int i=0;i<m;i++){
            s2.add(sc.nextInt());
        }
        
        Set<Integer> union = new TreeSet<>(s1);
        union.addAll(s2);
        Set<Integer> diff = new TreeSet<>(s1);
        diff.removeAll(s2);
        Set<Integer> intersection = new TreeSet<>(s1);
        intersection.retainAll(s2);
        
        System.out.println(union.toString().replaceAll("\\[","").replaceAll("\\]"," ").replaceAll(",",""));
        System.out.println(diff.toString().replaceAll("\\[","").replaceAll("\\]"," ").replaceAll(",",""));
        System.out.println(intersection.toString().replaceAll("\\[","").replaceAll("\\]"," ").replaceAll(",",""));
    }
}