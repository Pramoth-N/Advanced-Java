import java.util.*;

public class NumberToWords {
    
    private static final String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
    "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
    
    private static final String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(numberToWords(n));
    }
    public static String numberToWords(int num) {
        if (num == 0) return "zero";
        if (num < 0 || num > 9999) return "Invalid input";
        return convert(num).trim();
    }
    
    
    private static String convert(int num) {
        if (num < 20) return ones[num];
        else if (num < 100) return tens[num / 10] + (num % 10 != 0 ? " " + ones[num % 10] : "");
        else if (num < 1000) return ones[num / 100] + " hundred" + (num % 100 != 0 ? " and " + convert(num % 100) : "");
        else return ones[num / 1000] + " thousand" + (num % 1000 != 0 ? " " + convert(num % 1000) : "");
    }
    
}