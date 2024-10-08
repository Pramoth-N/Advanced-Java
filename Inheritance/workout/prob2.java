import java.util.*;

class Work{
    int work;
    public Work(int work){
        this.work = work;
    }
}

class GroupWork extends Work{
    private int worker , workRate;
    public GroupWork(int work ,int worker ,int workRate){
        super(work);
        this.worker = worker;
        this.workRate = workRate;
    }
    double computeWork(){
        return (double)work / (worker*workRate);
    }
}

class IndividualWork extends Work{
    private int workRate;
    public IndividualWork(int work ,int workRate){
        super(work);
        this.workRate = workRate;
    }
    double computeWork(){
        return (double)work / workRate;
    }
}

class Solution{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        IndividualWork i = new IndividualWork(a,b);
        GroupWork g = new GroupWork(a,c,d);
        if(a<=0){
            System.out.println("Invalid input");
        } else{
            if(b<=0){
                System.out.println("-1");
            } else {
                System.out.println(i.computeWork());
            }
            if(c<= 0 || d <= 0){
                System.out.println("-1");
            } else {
                System.out.println(g.computeWork());
            }
        }
    }
}