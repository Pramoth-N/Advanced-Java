import java.util.*;
class Triangle {
    double a,b,c;
    public Triangle(double s1 , double s2 , double s3){
        this.a=s1;
        this.b=s2;
        this.c=s3;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        Triangle t = new Triangle(a,b,c);
        
        System.out.print(t.triangleType());
    }
    
    public String triangleType(){
        if(a+b<=c){
            return new String("Invalid triangle");
        }
        
        if(a==b && b==c){
            return new String("equilateral");
        }
        if(a==b || b==c || a==c){
            return new String("isosceles");
        }
        return new String("scalene");
    }
}