import java.util.*;
 class RockPaperScissors{
     public static void main(String[] args){
         Scanner sc = new Scanner(System.in);
         String a = sc.next();
         String b = sc.next();
        //  if("rock paper scissorsRockPaperScissors".indexOf(a) == -1 || "rock paper scissorsRockPaperScissors".indexOf(b) == -1){
         
        //  }
         if(!a.equalsIgnoreCase("rock") && !a.equalsIgnoreCase("paper") && !a.equalsIgnoreCase("scissors") || !b.equalsIgnoreCase("rock") && !b.equalsIgnoreCase("paper") && !b.equalsIgnoreCase("scissors")){
            System.out.println("Invalid move");
            return;
         }
         int res = 0;
         if(a.equalsIgnoreCase(b)){
            System.out.println("TIE");
            return;
             
         }
         if(a.equalsIgnoreCase("rock")){
            res = (b.equalsIgnoreCase("scissors")? 1 : 2); 
         } else if( a.equalsIgnoreCase("paper")){
            res = (b.equalsIgnoreCase("rock")? 1 : 2); 
         } else {
            res = (b.equalsIgnoreCase("paper")? 1 : 2); 
         }
         
         System.out.printf("Player %d wins", res);
     }
 }