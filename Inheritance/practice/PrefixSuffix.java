import java.util.Scanner;

public class PrefixSuffix {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(!scanner.hasNextInt()){
            System.out.println("Invalid input");
            return;
        }
        int n = scanner.nextInt();
        // scanner.nextLine();
        
        if (n <= 0) {
            System.out.println("-1");
            return;
        }
        
        String[] words = new String[n];
        for (int i = 0; i < n; i++) {
            words[i] = scanner.next();
        }
        
        String prefix = scanner.next();
        String suffix = scanner.next();
        
        int lastMatchIndex = -1;
        int longestWordIndex = -1;
        int longestWordLength = 0;
        
        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(prefix) && words[i].endsWith(suffix)) {
                lastMatchIndex = i;
            }
            
            if (words[i].length() > longestWordLength) {
                longestWordLength = words[i].length();
                longestWordIndex = i;
            }
        }
        
        System.out.println(lastMatchIndex);
        System.out.println(longestWordIndex);
    }
}