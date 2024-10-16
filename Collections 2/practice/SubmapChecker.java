import java.util.*;

public class SubmapChecker {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        
        if (m <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> mainMap = new HashMap<>();
        
        for (int i = 0; i < m; i++) {
            String key = sc.next();
            if (!key.matches("[a-zA-Z]+")) {
                System.out.println("-1");
                return;
            }
            int value = sc.nextInt();
            mainMap.put(key, value);
        }
        
        int n = sc.nextInt();
        
        if (n <= 0 || n > m) {
            System.out.println("Invalid input");
            return;
        }
        
        HashMap<String, Integer> subMap = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            String key = sc.next();
            if (!key.matches("[a-zA-Z]+")) {
                System.out.println("-1");
                return;
            }
            int value = sc.nextInt();
            subMap.put(key, value);
        }
        
        System.out.println(isSubmap(mainMap, subMap)?"True" :"False");
        sc.close();
    }
    
    public static boolean isSubmap(HashMap<String, Integer> mainMap, HashMap<String, Integer> subMap) {
        for (Map.Entry<String, Integer> entry : subMap.entrySet()) {
            if (!mainMap.containsKey(entry.getKey()) || !mainMap.get(entry.getKey()).equals(entry.getValue())) {
                return false;
            }
        }
        return true;
    }
}