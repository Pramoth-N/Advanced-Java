import java.util.*;

public class RemoveInvalidParentheses {
    
    private boolean isValid(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                count++;
            } else if (c == ')') {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }
    
    public String removeInvalidParentheses(String s) {
        if (!s.matches("[a-zA-Z()]*")) {
            return "Invalid input";
        }
        
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        
        queue.add(s);
        visited.add(s);
        
        boolean found = false;
        
        while (!queue.isEmpty()) {
            String current = queue.poll();
            
            if (isValid(current)) {
                return current;
            }
            
            if (found) {
                continue;
            }
            
            for (int i = 0; i < current.length(); i++) {
                if (current.charAt(i) != '(' && current.charAt(i) != ')') {
                    continue;
                }
                String newStr = current.substring(0, i) + current.substring(i + 1);
                if (!visited.contains(newStr)) {
                    queue.add(newStr);
                    visited.add(newStr);
                }
            }
        }
        
        return "Invalid input";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        RemoveInvalidParentheses solution = new RemoveInvalidParentheses();
        String result = solution.removeInvalidParentheses(input);
        
            System.out.println(result);
        
    }
}