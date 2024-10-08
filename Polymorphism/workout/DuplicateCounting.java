import java.util.*;
 class DuplicateCounting{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         if(!s.matches("[a-zA-Z ]*")){
            System.out.println("Invalid input");
            return;
         }
         int[] count = new int[256];
         for(char c : s.toCharArray()){
             count[c]++;
         }
         boolean found = false;
         for(int i=0;i<256;i++){
             if(count[i]>1){
                 found=true;
                 System.out.println((char)i + "  " + count[i]);
             }
         }
         if(!found){
             System.out.println("0");
         }
     }
 }