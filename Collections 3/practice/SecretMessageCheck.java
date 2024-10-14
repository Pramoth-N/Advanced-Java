import java.util.*;

public class SecretMessageCheck {
    
    public boolean canBecomeIdentical(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        
        if (A.equals(B)) {
            Set<Character> charSet = new HashSet<>();
            for (char c : A.toCharArray()) {
                if (!charSet.add(c)) {
                    return true;
                }
            }
            return false;
        }
        
        List<Integer> mismatchIndices = new ArrayList<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                mismatchIndices.add(i);
            }
        }
        
        if (mismatchIndices.size() == 2) {
            int i = mismatchIndices.get(0);
            int j = mismatchIndices.get(1);
            return A.charAt(i) == B.charAt(j) && A.charAt(j) == B.charAt(i);
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String A = sc.nextLine();
        String B = sc.nextLine();
        
        SecretMessageCheck solution = new SecretMessageCheck();
        if(solution.canBecomeIdentical(A, B)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        
    }
}