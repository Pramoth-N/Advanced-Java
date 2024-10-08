import java.util.*;

class NumberToWords{
    int n;
    String ones[] = {"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    String tens[] = {"","","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"};
    public NumberToWords(int num){
        this.n = num;
    }
    public String convertToWords(){
        if(n==0){
            return "Zero";
        }
        if(n>=1000000000){
            return "Invalid input";
        }
        
        return toWord(n);
    }
    
    private String toWord(int n){
        StringBuilder s = new StringBuilder();
        
        if(n<20)
        s.append(ones[n]);
        else if(n<100)
        s.append(tens[n/10]).append(" ").append(toWord(n%10));
        else if(n<1000)
        s.append(toWord(n/100)).append(" Hundred ").append(toWord(n%100));
        else if(n<1000000)
        s.append(toWord(n/1000)).append(" Thousand ").append(toWord(n%1000));
        
        return s.toString().trim();
    }
}

class Solution {
    public static void main(String args[]){
        int num = new Scanner(System.in).nextInt();
        NumberToWords obj = new NumberToWords(num);
        System.out.println(obj.convertToWords());
    }
}