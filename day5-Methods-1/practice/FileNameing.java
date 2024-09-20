/*
 * 
 * You are given a list of folder names, and you need to process them to ensure that each folder name is unique. If a folder name is duplicated, append a number in parentheses to the name to make it unique.
Input Format
• The first line contains an integer n, the number of folder names.
• The next n lines each contain a folder name.
Output Format
• n lines, each containing a unique folder name.
• The number of folder names provided is not an integer or negative integer, The program should print Invalid input.
Constraints
• -50 ≤ n ≤ 100
• Folder names contain only alphabetical characters and digits.
 * 
 */

 import java.util.*;

class FileNameing {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n ;
        try{
            n = sc.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Invalid input");
            return;
        }
        if(n<=0){
            System.out.println("Invalid input");
            return;
        }
        Map<String,Integer> folderCount = new HashMap<>();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String folderName = sc.nextLine();
            if(folderCount.containsKey(folderName)) {
                folderCount.put(folderName , folderCount.get(folderName) + 1);
                System.out.println(folderName + "(" + folderCount.get(folderName) + ")");
            } else {
                folderCount.put(folderName , 0);
                System.out.println(folderName);
            }
        }
    }

}