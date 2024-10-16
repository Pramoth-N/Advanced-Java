import java.util.*;

class DistinctSubString{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int k = sc.nextInt();
        if(isValid(s)){
            System.out.println("Invalid input");
        } else if(count(s) == 1){
            System.out.println("-1");
        } else {
            System.out.println(distinctStringLen(s,k));
        }
    }
    
    private static int distinctStringLen(String s , int k){
        int n = s.length() , len  = 0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<=n;j++){
                if(count(s.substring(i,j)) == k){
                    len = Math.max(len,j-i);
                }
            }
        }
        return len;
    }
    
    private static int count(String s){
        Set<Character> cnt = new HashSet<>();
        for(char c : s.toCharArray()){
            cnt.add(c);
        }
        
        return cnt.size();
    }
    
    private static boolean isValid(String s){
        return s.length() > 2 && !s.matches("[A-Za-z]*");
    }
}