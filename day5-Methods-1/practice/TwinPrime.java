/*
 * Build a method that identifies and returns all twin prime numbers less than a given integer n. If n is less than one, return "-1".
Input Format
• The input consists of an integer n.
Output Format
• If n is valid and twin prime numbers are found, print all twin prime numbers less than n.
• If n is valid but no twin prime numbers are found, print "0".
• If n is invalid (less than or equal to one), print "-1".
Constraints
• -103 <= n <= 103
Explanation:
Twin primes are primes whose difference is 2, and have only one composite number in between them.
 */


 import java.util.*;

class TwinPrime {
    public static void main(String args[]) {
        int num = new Scanner(System.in).nextInt();
        if(num <= 1){
            System.out.println("-1");
            return;
        }
        
        if(!twinPrimeNumber(num)) {
            System.out.print("0");
        }
    }
    
    private static boolean twinPrimeNumber(int num) {
        boolean flag = false;
        for(int i=3;i<num-2;i++){
            if(isPrime(i , 2) && !isPrime(i+1 , 2) && isPrime(i+2 , 2)){
                flag = true;
                System.out.println(i + " " + (i+2));
            }
        }
        return flag;
    }
    private static boolean isPrime(int num , int i){
        if(num <=2){
            return num==2;
        }
        if(num%i==0)
        return false;
        if(i*i > num)
        return true;
        
        return isPrime(num , i+1);
    } 
}