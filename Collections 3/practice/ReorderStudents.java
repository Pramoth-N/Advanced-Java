import java.util.*;

public class ReorderStudents {
    
    public void reorder(int[] studentNumbers, int[] order, int n) {
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        for (int i : order) {
            if (i < 0 || i >= n) {
                System.out.println("Invalid input");
                return;
            }
        }
        
        int[] reordered = new int[n];
        for (int i = 0; i < n; i++) {
            reordered[order[i]] = studentNumbers[i];
        }
        
        for (int num : reordered) {
            System.out.printf("%d ",num);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] studentNumbers = new int[n];
        int[] order = new int[n];
        
        for (int i = 0; i < n; i++) {
            studentNumbers[i] = sc.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            order[i] = sc.nextInt();
        }
        
        ReorderStudents solution = new ReorderStudents();
        solution.reorder(studentNumbers, order, n);
    }
}