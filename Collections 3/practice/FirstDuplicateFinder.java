import java.util.*;

public class FirstDuplicateFinder {
    
    public void findFirstDuplicate(int[] arr, int n) {
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        boolean[] seen = new boolean[2001];
        
        for (int num : arr) {
            int index = num + 1000;
            if (seen[index]) {
                System.out.println(num);
                return;
            }
            seen[index] = true;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        FirstDuplicateFinder finder = new FirstDuplicateFinder();
        finder.findFirstDuplicate(arr, n);
    }
}