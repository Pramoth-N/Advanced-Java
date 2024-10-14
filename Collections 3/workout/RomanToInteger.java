import java.util.*;

public class RomanToInteger {
    
    public static int romanToInt(String s) {
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        
        int result = 0;
        int n = s.length();
        
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (!romanMap.containsKey(currentChar)) {
                System.out.println("Invalid input");
                return -1;
            }
            
            int currentVal = romanMap.get(currentChar);
            if (i + 1 < n && romanMap.get(s.charAt(i + 1)) > currentVal) {
                result -= currentVal;
            } else {
                result += currentVal;
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String romanNum = sc.nextLine();
        if(!romanNum.matches("[IVXLCDM]+")){
            System.out.println("Invalid input");
            return ;
        }
        int result = romanToInt(romanNum);
        System.out.println(result);
    }
}