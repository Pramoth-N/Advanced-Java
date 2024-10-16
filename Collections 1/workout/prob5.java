import java.util.*;
class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sub = sc.nextLine().trim();
        String main = sc.nextLine().trim();
        
        if(!sub.matches("[0-9 ]*") || !main.matches("[0-9 ]*")){
            System.out.print("Invalid input");
        } else{
            String[] s1 = main.split(" ");
            String[] s2 = sub.split(" ");
            boolean a1 = true , a2 = true;
            for(int i=0;i<s1.length-1;i++){
                if(!s1[i].equals(s1[i+1])){
                    a1 = false;
                    break;
                }
            }
            for(int i=0;i<s2.length-1;i++){
                if(!s2[i].equals(s2[i+1])){
                    a2 = false;
                    break;
                }
            }
            if(a1 || a2){
                System.out.print("-1");
            } else if(main.indexOf(sub) != -1){
                System.out.print("Sublist found");
            } else {
                System.out.print("Sublist not found");
            }
        }
    }
}