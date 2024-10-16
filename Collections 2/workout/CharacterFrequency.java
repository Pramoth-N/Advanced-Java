import java.util.*;

public class CharacterFrequency {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        if (s.length() < 2) {
            System.out.println("Invalid input");
            return;
        }
        
        LinkedHashMap<Character, Integer> frequencyMap = new LinkedHashMap<>();
        
        for (char ch : s.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
        sc.close();
    }
}