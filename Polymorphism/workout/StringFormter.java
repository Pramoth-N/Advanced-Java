import java.util.*;
 class StringFormater{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         StringBuilder sb = new StringBuilder();
         for(char c : s.toCharArray()){
             if(c=='-'){
                 System.out.println("Invalid input");
                return;
             }
             if(Character.isDigit(c) || Character.isAlphabetic(c)){
                 sb.append(c);
             }
         }
         System.out.println(sb);
     }
 }