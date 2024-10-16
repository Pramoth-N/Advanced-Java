import java.util.*;

public class RemoveKeyFromMap {
    
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
        
        String keyToRemove = sc.next();
        
        if (map.containsKey(keyToRemove)) {
            map.remove(keyToRemove);
            
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        } else {
            System.out.println("-1");
        }
        
        sc.close();
    }
}