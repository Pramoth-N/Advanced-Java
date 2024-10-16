import java.util.*;

class ArrayException {
    public static void main(String arsg[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;a[i++] = sc.nextInt());
        int i = sc.nextInt();
        try {
            System.out.println(a[i]);
        } catch(ArrayIndexOutOfBoundsException ex) {
            System.out.println("-1");
        }
    }
}