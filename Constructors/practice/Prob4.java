import java.util.*;

class Apple{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m;
        if(n<=0){
            System.out.println("-1");
            return;
        }
        int[] apple = new int[n];
        Integer[] box;
        try{
            for(int i=0;i<n;i++){
                apple[i] = sc.nextInt();
            }
            m= sc.nextInt();
            box = new Integer[m];
            for(int i=0;i<m;i++){
                box[i] = sc.nextInt();
            }
        } catch(InputMismatchException ex){
            System.out.println("Invalid input");
            return;
        }
        Arrays.sort(box,Collections.reverseOrder());
        int sum = Arrays.stream(apple).sum();
        for(int i=0;i<m;i++){
            sum -=box[i];
            if(sum <=0){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("Not");
    }
    
}