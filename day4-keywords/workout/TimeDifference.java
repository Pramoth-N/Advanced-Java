/*
 * You are given two times in the format of hours, minutes, and seconds. Implement a function to calculate the time difference between the two given times.
Input Format
• The first line of input contains three integers separated by spaces, representing the first time: hours1 minutes1 seconds1
• The second line of input contains three integers separated by spaces, representing the second time: hours2 minutes2 seconds2
Output Format
• If the time difference is negative, print Invalid input.
• Otherwise, return the time difference in the format HH:MM:SS.
Constraints
• Both times are valid and within the range of hours (-23 to 23), minutes (-59 to 59), and seconds (-59 to 59).
 * 
 */


import java.util.*;
import java.text.*;

class TimeDifference {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String t1 = sc.nextLine();
        String t2 = sc.nextLine();
        
        SimpleDateFormat sdf = new SimpleDateFormat("HH mm ss");
        try{
        Date time1 = sdf.parse(t1);
        Date time2 = sdf.parse(t2);
        long diffinMS = time1.getTime() - time2.getTime();
        if(diffinMS < 0){
            System.out.print("Invalid input");
            return;
        }
        long hrs = (diffinMS / (60 * 60 * 1000)) % 24;
        long mins = (diffinMS / (60 * 1000)) % 60;
        long sec = (diffinMS / 1000) % 60;
        
        System.out.format("%02d:%02d:%02d",hrs,mins,sec);
        }catch(ParseException ex){
            System.out.print("Invalid input");
            return;
        }
    }
}