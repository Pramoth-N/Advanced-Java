import java.util.*;

public class MergeHashMaps {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        if (m <= 0) {
            System.out.println("Invalid input");
            return;
        }

        HashMap<String, Integer> map1 = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map1.put(key, value);
        }
    
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> map2 = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            int value = sc.nextInt();
            map2.put(key, value);
        }
        
        if (map1.equals(map2)) {
            System.out.println("-1");
            return;
        }
        
        HashMap<String, Integer> mergedMap = new HashMap<>(map1);
        mergedMap.putAll(map2);
        
        for (Map.Entry<String, Integer> entry : mergedMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        
    }
}