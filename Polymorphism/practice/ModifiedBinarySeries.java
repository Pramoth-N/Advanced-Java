import java.util.*;

public class ModifiedBinarySeries {
    
    private static String binaryForm(int n){
        String bi = Integer.toBinaryString(n);
        char rev = '4';
        StringBuilder modifiedBinaryNumber = new StringBuilder();
        for(int i=0;i<bi.length();i++){
            char c = bi.charAt(i);
            if(c=='0'){
                if(i%2==0){
                    rev = '3';
                } else {
                    rev = '4';
                }
                modifiedBinaryNumber.append(rev);
            } else {
                modifiedBinaryNumber.append(c);
            }
        }
        return modifiedBinaryNumber.toString();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid input");
            return ;
        }
        String[] binarySeries = new String[n];
        for (int i = 1; i <= n; i++) {
            binarySeries[i-1] = binaryForm(i);
        }
        
        for(String s : binarySeries){
            System.out.print(s+ " ");
        }
    }
}