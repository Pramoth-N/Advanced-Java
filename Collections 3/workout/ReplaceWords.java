import java.util.*;

public class ReplaceWords {
    
    public static boolean isValidSentence(String sentence) {
        return sentence.matches("[a-zA-Z\\s]+");
    }
    
    public static String replaceWords(List<String> dictionary, String sentence) {
        if (!isValidSentence(sentence)) {
            return "Invalid input";
        }
        
        Set<String> dictSet = new HashSet<>(dictionary);
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            String replacement = word;
            
            for (int i = 1; i <= word.length(); i++) {
                String prefix = word.substring(0, i);
                if (dictSet.contains(prefix)) {
                    replacement = prefix;
                    break;
                }
            }
            
            result.append(replacement).append(" ");
        }
        
        return result.toString().trim();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        List<String> dictionary = Arrays.asList(sc.nextLine().split(" "));
        
        String sentence = sc.nextLine();
        
        System.out.println(replaceWords(dictionary, sentence));
    }
}