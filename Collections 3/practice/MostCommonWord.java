import java.util.*;

public class MostCommonWord {
    
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        
        if (!paragraph.matches("[\\p{ASCII}]*") || !Arrays.stream(banned).allMatch(word -> word.matches("[a-zA-Z]*"))) {
            System.out.println("Invalid input");
            return "";
        }
        
        paragraph = paragraph.toLowerCase().replaceAll("[^a-zA-Z]", " ");
        String[] words = paragraph.split("\\s+");
        
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (!bannedSet.contains(word) && !word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }
        
        String mostCommon = "";
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostCommon = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        
        return mostCommon;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paragraph = sc.nextLine();
        String bannedLine = sc.nextLine();
        String[] banned = bannedLine.split("\\s+");
        
        MostCommonWord solution = new MostCommonWord();
        String result = solution.mostCommonWord(paragraph, banned);
        
        System.out.println(result);
    }
}