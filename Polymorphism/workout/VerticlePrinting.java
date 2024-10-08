import java.util.*;
 class VerticlePrinting{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String st = sc.nextLine();
         if(!st.matches("[A-Z ]*")){
            System.out.println("Invalid input");
            return;
         }
         String[] s = st.split(" ");
         int len = s[0].length();
         for(String str : s){
             len = Math.max(len,str.length());
         }
         for(int i=0;i<len;i++){
             for(String str : s){
                 System.out.print(i<str.length()?str.charAt(i)+" " : "  ");
                 
             }
            System.out.println();
         }
     }
 }