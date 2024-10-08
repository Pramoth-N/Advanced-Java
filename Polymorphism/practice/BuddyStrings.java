import java.util.*;
class BuddyStrings{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        char[] a = sc.next().toCharArray();
        char[] b = sc.next().toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        if(a.length != b.length){
            System.out.print("False");
        } else {
            for(int i=0;i<a.length;i++){
                if(a[i] != b[i]){
                    System.out.print("False");
                    return;
                }
            }
            System.out.print("True");
        }
    }
}