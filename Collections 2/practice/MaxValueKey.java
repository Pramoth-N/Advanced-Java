import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxValueKey {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        String maxKey = null;
        int maxValue = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            
            map.put(key, value);
            
            if (value > maxValue) {
                maxValue = value;
                maxKey = key;
            } else if (value == maxValue && maxKey == null) {
                maxKey = key;
            }
        }
        
        System.out.println(maxKey);
        sc.close();
    }
}