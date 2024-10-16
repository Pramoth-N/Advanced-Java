import java.util.*;

public class CheckKeyInHashMap {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map.put(key, value);
        }
        
        String keyToCheck = sc.next();
        
        if (map.containsKey(keyToCheck)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        
        sc.close();
    }
}