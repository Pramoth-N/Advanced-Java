import java.util.*;

public class CanReorderDoubled {
    
    public static boolean canReorderDoubled(int[] arr) {
        Map<Integer, Integer> countMap = new TreeMap<>(Comparator.comparingInt(Math::abs));
        
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        for (int num : countMap.keySet()) {
            if (countMap.get(num) > countMap.getOrDefault(2 * num, 0)) {
                return false;
            }
            countMap.put(2 * num, countMap.getOrDefault(2 * num,0) - countMap.get(num));
        }
        
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n % 2 != 0 || n < 0) {
            System.out.println("Invalid input");
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] < 0){
                System.out.println("Invalid input");
                return;
            }
        }
        
        boolean result = canReorderDoubled(arr);
        if(result){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}