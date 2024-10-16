import java.util.*;

public class WordFrequency {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> wordMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
        }
        
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        sc.close();
    }
}