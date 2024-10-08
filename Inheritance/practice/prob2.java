import java.util.*;

class Dummy{}

class Solution extends Dummy{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        if(n<0){
           System.out.printf("%s","Invalid input");
           return;
        }
        List<Double> l = new ArrayList<>();
        while(n-- > 0){
            String[] s = sc.nextLine().trim().split(" ");
            double a = Double.parseDouble(s[1]);
            double b = Double.parseDouble(s[2]);
                l.add(a*((100d-b)/100d));
           
            if("ProductSale ClearanceSale SeasonalSale".indexOf(s[0]) == -1){
                System.out.printf("%s","Invalid input");
                return;
            }
        }
        for(double d : l)
        System.out.println(d);
    }
}